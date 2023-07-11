SUMMARY = "Development libraries and header files for dc1394"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the dc1394 library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-devel-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "66c8b0a0b34bdd6e2c0bb30806d6ff07ba9e4c38dd39a6a020578116defc5c06ff705c5493347d71b3e5b7e40e753762d585a378a0e661f550262dec275a0a32"

RPROVIDES:${PN} += "libdc1394-devel \
pkgconfig-libdc1394-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdc1394-26 \
libdc1394-tools \
pkgconfig-libraw1394"

inherit rpm
