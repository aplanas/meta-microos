SUMMARY = "Documentation for texlive-yazd-thesis"
DESCRIPTION = "This package includes the documentation for texlive-yazd-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-doc-2023.209.0.0.3svn61719-53.2.noarch.rpm"
RPM_HASH = "ae1f0f09282a843ca67063ffb0d65f644700f7c1b9456e46800fef845fe64d85d1d424d2165bbfbcfb9dd51a371e3395075568f7a7e67d8c403f6c11aa04379d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yazd-thesis-doc-fa \
texlive-yazd-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
