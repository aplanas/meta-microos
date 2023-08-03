SUMMARY = "Documentation for texlive-pst-vowel"
DESCRIPTION = "This package includes the documentation for texlive-pst-vowel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-doc-2023.209.1.0svn25228-54.1.noarch.rpm"
RPM_HASH = "9292f13b4d869a03f421e0a3a26bf7d333350eb0decfb9f1e54f4c3439d7cdf010e6ecbc8fa5fb7a5853bb52469850833e292c25caad35e771fb0b8ef81f9125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-vowel-doc"

RDEPENDS:${PN} += ""

inherit rpm
