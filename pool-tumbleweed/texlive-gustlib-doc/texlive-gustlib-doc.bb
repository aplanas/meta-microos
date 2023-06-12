SUMMARY = "Documentation for texlive-gustlib"
DESCRIPTION = "This package includes the documentation for texlive-gustlib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustlib-doc-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "90cff749330f21cba4f7397b5106420640d4b85932914fd1f1fe082733f5dbbc1feae9d1f39d016b2fc071d0a7ca733eb9ba7aceaafa29f7b13d94dc900567e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustlib-doc"
RDEPENDS:${PN} += ""

inherit rpm
