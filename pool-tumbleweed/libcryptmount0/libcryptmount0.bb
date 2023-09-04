SUMMARY = "Library to mount crypto images and handle key files"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.20"

RPM_NAME = "libcryptmount0-2.20-1.1.aarch64.rpm"
RPM_HASH = "8edff12525488908513320c09be743a16e23392cf0c3c4811c38a361074afa9d762fd585def295d1bcfc2cbadd300d213122ae82bdb60fe1c6192fcb7f3ae270"

RPROVIDES:${PN} += "libcryptmount.so.0 \
libcryptmount0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12"

inherit rpm
