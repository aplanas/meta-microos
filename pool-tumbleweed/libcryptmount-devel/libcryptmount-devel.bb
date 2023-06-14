SUMMARY = "Development files for libcryptmount"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "libcryptmount-devel-2.19-2.3.aarch64.rpm"
RPM_HASH = "33881dd7eec703549f7dd1682cc7586043944da56e427ba2827c3e57e841f0c7eda43e5c7681a7ea1bf4e3ff964330ab8d5a678f1ee36b3783110c283682d7b0"

RPROVIDES:${PN} += "libcryptmount-devel \
pkgconfig-libcryptmount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptmount0"

inherit rpm
