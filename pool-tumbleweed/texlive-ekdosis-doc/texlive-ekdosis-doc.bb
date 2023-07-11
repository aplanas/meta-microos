SUMMARY = "Documentation for texlive-ekdosis"
DESCRIPTION = "This package includes the documentation for texlive-ekdosis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn61113"

RPM_NAME = "texlive-ekdosis-doc-2023.201.1.4svn61113-53.2.noarch.rpm"
RPM_HASH = "83cc20feb3cdcd12481a74e08e0e7587449ca629abde490cc46f443a50ca92e22621ca7251b9644f16c0d6280b964ce8aa26cec6e0fe27bf9843def1bcd1c854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekdosis-doc"

RDEPENDS:${PN} += ""

inherit rpm
