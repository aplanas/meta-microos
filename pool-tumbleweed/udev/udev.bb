SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "Udev creates and removes device nodes in /dev for devices discovered or \
removed from the system. It receives events via kernel netlink messages \
and dispatches them according to rules in /usr/lib/udev/rules.d/. Matching \
rules may name a device node, create additional symlinks to the node, \
call tools to initialize a device, or load needed kernel modules."
LICENSE = "GPL-2.0-only"

PV = "253.7"

RPM_NAME = "udev-253.7-1.2.aarch64.rpm"
RPM_HASH = "f00573a7697431b5e2b47a21be3d6cfb904e7080c247d5ff83ff264358b341b84c0c1cea7242422d49d2a5125564eba0c8d0471c76b842e13075f1d89f64761e"

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
