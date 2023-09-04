SUMMARY = "Development files for libcryptmount"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.20"

RPM_NAME = "libcryptmount-devel-2.20-1.1.aarch64.rpm"
RPM_HASH = "98eaf391a6226fb3be541881de06d260287b636cb9c49d6a739b5a6deb76b2db0c522e4aed1ab32598314d64930caca6434a9e97a7a811c6f34997ddab609ae7"

RPROVIDES:${PN} += "libcryptmount-devel \
pkgconfig-libcryptmount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptmount0"

inherit rpm
