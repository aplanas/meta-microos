SUMMARY = "Development files and tools for PDAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-devel-2.3.0-2.15.aarch64.rpm"
RPM_HASH = "fa35b685a21dd13ae4998a620ee99fb45e6fc83ecb038483e831f20a9ee4562f131e7f7dda527ebf8811acd6387e5e063f0a6d89cca7baab287f3637a4e74b5c"

RPROVIDES:${PN} += "PDAL-devel \
PDAL-devel(aarch-64) \
cmake(PDAL) \
libPDAL-devel \
libPDAL13-devel \
libpdal-devel \
libpdal13-devel \
pkgconfig(pdal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
cmake \
laszip-devel \
libPDAL13 \
libboost_filesystem-devel \
libboost_headers-devel \
libboost_program_options-devel \
pkgconfig(gdal) \
pkgconfig(libxml-2.0) \
xz-devel \
zlib-devel"

inherit rpm
