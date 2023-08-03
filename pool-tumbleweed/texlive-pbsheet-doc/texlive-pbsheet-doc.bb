SUMMARY = "Documentation for texlive-pbsheet"
DESCRIPTION = "This package includes the documentation for texlive-pbsheet"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-doc-2023.209.0.0.1svn24830-52.1.noarch.rpm"
RPM_HASH = "13381e70a950843f8df83316e2abdce672985be5ded117a3b0d32bc8f3ab037b452425e4972343332adc0d27575cbd664bfda88cc6281528fc9f49d8cb8c52f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pbsheet-doc-fr \
texlive-pbsheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
