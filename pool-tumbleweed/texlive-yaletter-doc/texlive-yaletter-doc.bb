SUMMARY = "Documentation for texlive-yaletter"
DESCRIPTION = "This package includes the documentation for texlive-yaletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42830"

RPM_NAME = "texlive-yaletter-doc-2023.201.1.1svn42830-52.1.noarch.rpm"
RPM_HASH = "f930805bec4178a0303b7ae809d970c8652ceacfcd288a4701ce5a27c76f1d474ee6e81761f0f14b6cf58ec105a362eae736cce4c871f475436e093b4e1a2863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
