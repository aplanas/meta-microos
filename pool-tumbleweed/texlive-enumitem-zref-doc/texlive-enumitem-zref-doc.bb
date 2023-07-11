SUMMARY = "Documentation for texlive-enumitem-zref"
DESCRIPTION = "This package includes the documentation for texlive-enumitem-zref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-doc-2023.201.1.8svn21472-53.2.noarch.rpm"
RPM_HASH = "c0b75af91936e512d652479ada2cc585143ba224c271c2547c23a8d6f009fe62aff9bc5289de25f332339d9e655b8550544e37a80e1873edc0d66eb72495274d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
