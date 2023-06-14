SUMMARY = "Library to mount crypto images and handle key files"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "libcryptmount0-2.19-2.3.aarch64.rpm"
RPM_HASH = "2c54f352172cd157faf53b1f4ea1d288a47d3b8bc132d098e003a245b4f9c5df6bb89b73213b5b1ce086187a487814a5b374831ca136880d379de59ff09db3ff"

RPROVIDES:${PN} += "libcryptmount.so.0 \
libcryptmount0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12"

inherit rpm
