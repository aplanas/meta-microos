SUMMARY = "Documentation for texlive-chinese-jfm"
DESCRIPTION = "This package includes the documentation for texlive-chinese-jfm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-doc-2023.209.1.1.1svn57758-54.1.noarch.rpm"
RPM_HASH = "9ff10721db8e81395dee108ecbb3f1528b418aef63a2f9eb5226d074315ff262e8ea41dda79c7d6b26ba567eab0b5814467e09af98c97c07dba7bfd60f52c343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chinese-jfm-doc-zh \
texlive-chinese-jfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
