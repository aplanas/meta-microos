SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-info-2.37-4.4.noarch.rpm"
RPM_HASH = "9485fa3dd2328c6ce99fe07ade69a9b4f8c1bdbdd3abff3e0f21c77aa5fd8817f4415918c2aaa0a9688d1654060d815918994337deb27ba55a651a083c77dbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
