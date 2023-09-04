SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "This package provides systemd-udevd. The udev daemon receives device uevents \
directly from the kernel whenever it adds or removes a device from the system in \
/dev, or it changes its state. When udev receives a device event, it matches its \
configured set of rules, located in /usr/lib/udev/rules.d/, against various device \
attributes to identify the device. Rules that match may adjust device node \
permissions, create meaningful symlink names or provide additional device \
information to be stored in the udev database. \
 \
The udev daemon may also rename network interfaces and perform various network \
device configurations, see systemd.link(5) for more details. \
 \
This package also provides various tools and services that operate on devices \
exclusively. For example it contains systemd-cryptsetup to manage encrypted \
block devices as well as systemd-growfs to instruct the kernel to grow the \
mounted filesystem to full size of the underlying block device. \
 \
This package shouldn't be necessary in containers."
LICENSE = "GPL-2.0-only"

PV = "253.8"

RPM_NAME = "udev-253.8-1.2.aarch64.rpm"
RPM_HASH = "70120cec063c3d8e2c06073b316f5ccb1d515f6b9ccbe0c7bb4f582a5e5d506c52c7aee2df048867531285bff2ad7d327cf38b3cf322dd505ef4e207e85fbfb5"

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
