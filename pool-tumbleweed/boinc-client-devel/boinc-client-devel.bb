SUMMARY = "Development files for libboinc"
DESCRIPTION = "This package contains development files for libboinc."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "boinc-client-devel-7.22.2-1.1.aarch64.rpm"
RPM_HASH = "182206b0cd23ffaed3dccef76cc9fc36aa9473988b83ea89c7e3adcefd8a3776eeac867efc89018d4d51612771aa0acfef183d62a9b30f873f511cc20d441dfa"

RPROVIDES:${PN} += "boinc-client-devel \
boinc-client-devel(aarch-64) \
libboinc-devel \
pkgconfig(libboinc) \
pkgconfig(libboinc_api) \
pkgconfig(libboinc_crypt) \
pkgconfig(libboinc_graphics2) \
pkgconfig(libboinc_opencl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboinc7 \
openssl-devel \
pkgconfig(libjpeg) \
pkgconfig(openssl)"

inherit rpm
