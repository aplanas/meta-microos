SUMMARY = "Documentation for texlive-fancyref"
DESCRIPTION = "This package includes the documentation for texlive-fancyref"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9csvn15878"

RPM_NAME = "texlive-fancyref-doc-2023.209.0.0.9csvn15878-53.1.noarch.rpm"
RPM_HASH = "41808caa0cb9290e79b1bee69141e2305fb4c15d6ec54bc57b7a8bc2cd40b32d9ecd3b55aabd0a14fe7bae7a283fc6c49dbe26ff439e30b3860b3208aae6d841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
