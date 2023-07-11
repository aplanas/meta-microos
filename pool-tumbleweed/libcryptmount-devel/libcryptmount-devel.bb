SUMMARY = "Development files for libcryptmount"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "libcryptmount-devel-2.19-2.4.aarch64.rpm"
RPM_HASH = "882488844679300f7e26f84668f8ee957214a8135100227d2cadbd20a4c3a7495265ca7318bb498eef938da9cbb1c0ca71f5256b5690b10074324c6a3d3b2f52"

RPROVIDES:${PN} += "libcryptmount-devel \
pkgconfig-libcryptmount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptmount0"

inherit rpm
