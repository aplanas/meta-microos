SUMMARY = "Development files for link-grammar, an English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology. \
 \
This package contains the development files for development with \
Link Grammar."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "link-grammar-devel-5.10.5-1.6.aarch64.rpm"
RPM_HASH = "53a8746b66d82409dc0fe504f5e52a2ccb8471842d6dfd3b216868e106f67561ea9d86e828caaa1ecd4ef4eaf9724928c7c1039f6cc8d5bd19de2af2ee137b2e"

RPROVIDES:${PN} += "link-grammar-devel \
pkgconfig-link-grammar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblink-grammar5"

inherit rpm
