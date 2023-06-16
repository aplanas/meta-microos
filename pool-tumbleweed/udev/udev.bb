SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "Udev creates and removes device nodes in /dev for devices discovered or \
removed from the system. It receives events via kernel netlink messages \
and dispatches them according to rules in /usr/lib/udev/rules.d/. Matching \
rules may name a device node, create additional symlinks to the node, \
call tools to initialize a device, or load needed kernel modules."
LICENSE = "GPL-2.0-only"

PV = "253.4"

RPM_NAME = "udev-253.4-2.1.aarch64.rpm"
RPM_HASH = "1dabbe7b60ce59b8f8e47e46f80f196566d9a2fd18fd5703165b54aba835ef0eb7678227270281d61b82ef32007af150408e53ee5f3eb9cac1f026e92479d756"

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
libp11-kit.so.0 \
libsystemd-shared-253.so \
sed \
system-group-hardware \
systemd"

inherit rpm
