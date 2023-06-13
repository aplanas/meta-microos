SUMMARY = "Development files for the Osmocom GSM utility library"
DESCRIPTION = "The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogsm."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogsm-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "fd334eee4929fc481ebc45b1389adeee3c15f5728d9beb24b78f5ee8344a1a6515da8a0589a6ff663df3a49812b8765f2cac4bd3df765813702d908f81d8f9ab"

RPROVIDES:${PN} += "libosmogsm-devel \
libosmogsm-devel(aarch-64) \
pkgconfig(libosmogsm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmogsm18 \
pkgconfig(libosmocore) \
pkgconfig(libosmoisdn) \
pkgconfig(talloc)"

inherit rpm
