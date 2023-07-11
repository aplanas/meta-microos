SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.208"

RPM_NAME = "texlive-devel-2023.208-60.1.noarch.rpm"
RPM_HASH = "b3c6b3f5dd5ab351f1ac441440293873199622f8be490b2c6bb9256192b398c5eb69255f4a5a11277498761dfed68ab6d5f62ff56e02a4e768fdab9359632230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-devel"

RDEPENDS:${PN} += "texlive-bin-devel \
texlive-cweb \
texlive-kpathsea-devel \
texlive-ptexenc-devel \
texlive-synctex-devel \
texlive-texlua-devel \
texlive-web"

inherit rpm
