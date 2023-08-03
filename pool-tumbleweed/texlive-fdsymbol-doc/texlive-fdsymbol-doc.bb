SUMMARY = "Documentation for texlive-fdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-doc-2023.209.0.0.8svn61719-53.1.noarch.rpm"
RPM_HASH = "67831c8e75e9c6945884fd66e1efe4010eb731d65bd31e6ab4ccbad7903f5e2b2a09d11cc1cfa67e79d614f7ba03d43310cfec2ed91d82a6e48998c570daf15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fdsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
