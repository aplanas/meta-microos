SUMMARY = "Documentation for texlive-pxcjkcat"
DESCRIPTION = "This package includes the documentation for texlive-pxcjkcat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-doc-2023.209.1.4svn63967-54.1.noarch.rpm"
RPM_HASH = "c118ecff06adc4829ecd047bf96b952f2da710ddf019ac736553748f69a9dbed79dd4057dc0417a667939e6d0153c54ebb3bd1d46393774de81ec516c786e0dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxcjkcat-doc-ja;en \
texlive-pxcjkcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
