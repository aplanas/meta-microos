SUMMARY = "Documentation for texlive-fixdif"
DESCRIPTION = "This package includes the documentation for texlive-fixdif"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn66015"

RPM_NAME = "texlive-fixdif-doc-2023.201.2.0bsvn66015-52.1.noarch.rpm"
RPM_HASH = "e843743c1d05ac637a1acc8070859eced9300cd26daede04fca9848f6ffbc90b0f12c01ccad6c547d481be4f6902e33e576f7ef715f2990492b7901a65421f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixdif-doc-zh \
texlive-fixdif-doc"

RDEPENDS:${PN} += ""

inherit rpm
