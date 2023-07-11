SUMMARY = "Developer documentation for pangomm, a C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library. \
This package contains the developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "pangomm-doc-2.50.1-1.4.noarch.rpm"
RPM_HASH = "b758c87502c5dbb6e77a4de9a27c87fcd25a81f8cafbdd34aa3cb223e919d8fd6e937a671c1c8623684533c84d1e555607565ab6647f0facb0c1d0b1325a3bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pangomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
