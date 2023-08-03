SUMMARY = "Documentation for texlive-boites"
DESCRIPTION = "This package includes the documentation for texlive-boites"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32235"

RPM_NAME = "texlive-boites-doc-2023.209.1.1svn32235-53.1.noarch.rpm"
RPM_HASH = "14f2781f325b04c0155cf14914a046892718e102b28818fbdc1093a501b0b5ea4c043a589431d39cb21a000ebf62db53ecc93c69779e8aceef016b035236b011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boites-doc"

RDEPENDS:${PN} += ""

inherit rpm
