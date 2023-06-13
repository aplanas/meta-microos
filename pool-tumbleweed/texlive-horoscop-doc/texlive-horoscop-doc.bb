SUMMARY = "Documentation for texlive-horoscop"
DESCRIPTION = "This package includes the documentation for texlive-horoscop"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.01svn56021"

RPM_NAME = "texlive-horoscop-doc-2023.201.1.01svn56021-53.1.noarch.rpm"
RPM_HASH = "9382dc049a506c174f5a20be1b08bd6f4970475c7835ea53b92364543bbacf63b3ef06c2be1cf4776df58d17d3adda5b1d6eee99d2234446ebf5cb1680cbaf84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-horoscop-doc"

RDEPENDS:${PN} += ""

inherit rpm
