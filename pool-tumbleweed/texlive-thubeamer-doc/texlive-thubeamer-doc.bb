SUMMARY = "Documentation for texlive-thubeamer"
DESCRIPTION = "This package includes the documentation for texlive-thubeamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-doc-2023.209.1.1.0svn61071-55.1.noarch.rpm"
RPM_HASH = "2a10742d58c579ae78f3c732a7bdeb06e72f650d9947860c31b049f5a6a4591ca2bbb157c48e0a7bca29169ebf53b2224015548f469a41b57f53c86fe65d8391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thubeamer-doc-zh \
texlive-thubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
