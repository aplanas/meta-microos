SUMMARY = "Documentation for texlive-ellipse"
DESCRIPTION = "This package includes the documentation for texlive-ellipse"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39025"

RPM_NAME = "texlive-ellipse-doc-2023.201.1.0svn39025-53.2.noarch.rpm"
RPM_HASH = "b94a9e777c95f53e9f6e45a0e3f06cf4804bd2329a78f96147ad9de499f4851d1d9a72c40e9c0a77741653abdf23580a7222eafc80f27c8adec406d4e75d459d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipse-doc"

RDEPENDS:${PN} += ""

inherit rpm
