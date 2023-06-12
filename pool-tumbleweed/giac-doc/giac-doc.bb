SUMMARY = "Documentation for giac"
DESCRIPTION = "This document describes the basic structure and provides information on \
usage of giac, a computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-doc-1.9.0.27-4.5.noarch.rpm"
RPM_HASH = "5848e4b31474adf3dc917b0941cf0cb98461404f4c5bb845e33000448d3aecb524dd8d05e8327f9f192bb7481d0529914bbcd9cc4a36b64e58afcbdb16921fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
