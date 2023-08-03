SUMMARY = "Documentation for texlive-stix2-otf"
DESCRIPTION = "This package includes the documentation for texlive-stix2-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-doc-2023.209.2.12svn58735-58.1.noarch.rpm"
RPM_HASH = "2314b2fef42e4bde973b275eaa4f016dd6b58d8a184a8818d147dbf619c467d5901aa62abefdce0f02a5e7fa10e9e10f3e19b4f660cc79fb6c6daddceccaed50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
