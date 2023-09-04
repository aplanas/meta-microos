SUMMARY = "Documentation for texlive-guitarchordschemes"
DESCRIPTION = "This package includes the documentation for texlive-guitarchordschemes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-doc-2023.209.0.0.7svn54512-54.2.noarch.rpm"
RPM_HASH = "98c305b098629957d887b474334bbf4b407544482ebfd152fd07410916ef7ba83b7b502a9e46e6ba0818834b7e52b2f9955ea5447855781f15c4c0312d325a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitarchordschemes-doc-en \
texlive-guitarchordschemes-doc"

RDEPENDS:${PN} += ""

inherit rpm
