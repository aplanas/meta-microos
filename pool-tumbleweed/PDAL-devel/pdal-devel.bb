SUMMARY = "Development files and tools for PDAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-devel-2.3.0-2.16.aarch64.rpm"
RPM_HASH = "34769650d689f8bc16c15fe2417e740a0af2c4f409842bc7a40b6a8c4734d68cf944a3d01597ebafeb2f4febe59236304f7fd2ec24ebbde22d6619759acbdce1"

RPROVIDES:${PN} += "PDAL-devel \
cmake-PDAL \
libPDAL-devel \
libPDAL13-devel \
libpdal-devel \
libpdal13-devel \
pkgconfig-pdal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cmake \
laszip-devel \
libPDAL13 \
libboost-filesystem-devel \
libboost-headers-devel \
libboost-program-options-devel \
pkgconfig-gdal \
pkgconfig-libxml-2.0 \
xz-devel \
zlib-devel"

inherit rpm
