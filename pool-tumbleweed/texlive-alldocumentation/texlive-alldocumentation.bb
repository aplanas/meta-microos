SUMMARY = "Attract all documentations of installed TeXLive packages"
DESCRIPTION = "This package will attract all the documentation packages of any \
already installed TeXLive package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.208"

RPM_NAME = "texlive-alldocumentation-2023.208-58.1.noarch.rpm"
RPM_HASH = "1459809c3e0e5e54d412aba65c78b427c30be6d6341b461cabf18e9d849cdef860e06ac4132e150725a428433771626f455110dc0f6c907a075828a0c07d11c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alldocumentation"

RDEPENDS:${PN} += ""

inherit rpm
