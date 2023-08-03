SUMMARY = "Documentation for texlive-recorder-fingering"
DESCRIPTION = "This package includes the documentation for texlive-recorder-fingering"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-doc-2023.209.1.1bsvn66008-54.1.noarch.rpm"
RPM_HASH = "2799c434e18cee212937a20eebc79fb1d876baedb2b75772a81ebca3b0ebae702214fd696b2372e753944ee5bbfb9cab5ee10e43bc93f5dc10cb2ef80edfd72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recorder-fingering-doc"

RDEPENDS:${PN} += ""

inherit rpm
