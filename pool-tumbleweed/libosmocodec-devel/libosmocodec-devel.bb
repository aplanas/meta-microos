SUMMARY = "Development files for the Osmocom GSM codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocodec."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocodec-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "0dc721a9331f672acf62ff991d64cf57417ed44a78928e0ef3b4df136fa96a7cbfe6d33bd405a57c89d7f2dfb1df19d47035581d3083b59597604bb4eb059db0"

RPROVIDES:${PN} += "libosmocodec-devel \
pkgconfig-libosmocodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocodec0 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
