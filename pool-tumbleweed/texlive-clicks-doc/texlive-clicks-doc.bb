SUMMARY = "Documentation for texlive-clicks"
DESCRIPTION = "This package includes the documentation for texlive-clicks"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn64602"

RPM_NAME = "texlive-clicks-doc-2023.209.0.0.4.1svn64602-54.1.noarch.rpm"
RPM_HASH = "ec8a541ef5853fbeeec8c3c1e5b148a9ebcfaaf694dae7104f87e3308acdedd4e9c62b5de75964d667b4deabf45694937868cbe396f80ea0f35e2fb8b3263375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clicks-doc"

RDEPENDS:${PN} += ""

inherit rpm
