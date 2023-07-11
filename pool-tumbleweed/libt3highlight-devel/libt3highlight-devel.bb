SUMMARY = "Development files for libt3highlight, a syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3highlight."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-devel-0.5.0-1.16.aarch64.rpm"
RPM_HASH = "55a40e03ee53f535948a1d43bc4d4a6bff619613492b3ee59334fe8eaab2fd0e53fae51afa54128c36e513f23a18d8b555b476e76b7ec00ac6b794249ea97471"

RPROVIDES:${PN} += "libt3highlight-devel \
pkgconfig-libt3highlight"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3highlight2 \
pkgconfig-libpcre2-8 \
pkgconfig-libt3config"

inherit rpm
