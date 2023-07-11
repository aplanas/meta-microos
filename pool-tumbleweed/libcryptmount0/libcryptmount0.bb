SUMMARY = "Library to mount crypto images and handle key files"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "libcryptmount0-2.19-2.4.aarch64.rpm"
RPM_HASH = "38913747da2bc07524e9e15180e408ca4c3b2d3a1cb80c2eb42015aa471f262330c428afa07e272477bf990072668c0e831968cd86f39fce455864289ca79230"

RPROVIDES:${PN} += "libcryptmount.so.0 \
libcryptmount0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12"

inherit rpm
