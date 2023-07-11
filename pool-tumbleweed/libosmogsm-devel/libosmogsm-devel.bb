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

RPM_NAME = "libosmogsm-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "6fdc4828024656141dfb1785986095f1cd3f35d8a65af1cd915a453ca6740181026e2d083aea99744f5cc09704f861cf16aeb33eeda3d9b330c8460aaebd310d"

RPROVIDES:${PN} += "libosmogsm-devel \
pkgconfig-libosmogsm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmogsm18 \
pkgconfig-libosmocore \
pkgconfig-libosmoisdn \
pkgconfig-talloc"

inherit rpm
