SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "Udev creates and removes device nodes in /dev for devices discovered or \
removed from the system. It receives events via kernel netlink messages \
and dispatches them according to rules in /usr/lib/udev/rules.d/. Matching \
rules may name a device node, create additional symlinks to the node, \
call tools to initialize a device, or load needed kernel modules."
LICENSE = "GPL-2.0-only"

PV = "253.7"

RPM_NAME = "udev-253.7-2.1.aarch64.rpm"
RPM_HASH = "b45936a9413e127ad0ac9443be9df35c2b462a427f12e5d0137e90c87527cefbea07c13cbf95d39ed384afc54d7929f7b9c0f3737b0e92f846c761d9b770fa5a"

RPROVIDES:${PN} += "config-udev \
libcryptsetup-token-systemd-fido2.so \
libcryptsetup-token-systemd-pkcs11.so \
libcryptsetup-token-systemd-tpm2.so \
pkgconfig-udev \
udev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
filesystem \
group-kvm \
kmod \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libkmod.so.2 \
libm.so.6 \
libp11-kit.so.0 \
libsystemd-shared-253.so \
sed \
system-group-hardware \
systemd"

inherit rpm
