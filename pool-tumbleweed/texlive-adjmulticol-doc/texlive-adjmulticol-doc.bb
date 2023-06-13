SUMMARY = "Documentation for texlive-adjmulticol"
DESCRIPTION = "This package includes the documentation for texlive-adjmulticol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn63320"

RPM_NAME = "texlive-adjmulticol-doc-2023.201.1.5svn63320-54.1.noarch.rpm"
RPM_HASH = "f641be0a0842efecf5bbb377405befaa9fb443d596d675fbc507ad6987bec67ee008d384645a64f43c584e5fb602924f4fd616ac3f707ad6028f6402a77cff60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjmulticol-doc"

RDEPENDS:${PN} += ""

inherit rpm
