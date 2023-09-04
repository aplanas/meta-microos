SUMMARY = "Documentation for texlive-esami"
DESCRIPTION = "This package includes the documentation for texlive-esami"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn61596"

RPM_NAME = "texlive-esami-doc-2023.209.2.7svn61596-54.2.noarch.rpm"
RPM_HASH = "c13f799f81a152cb60ec3a3d585a0b269af28738ec0240fa6af4ca9b4c6b809441595097fde621bd4f57c8b15828920e4e9380bb87f8f4f62483dac669edf9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-esami-doc-en;it \
texlive-esami-doc"

RDEPENDS:${PN} += ""

inherit rpm
