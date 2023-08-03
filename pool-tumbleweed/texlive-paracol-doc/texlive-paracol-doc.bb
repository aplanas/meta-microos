SUMMARY = "Documentation for texlive-paracol"
DESCRIPTION = "This package includes the documentation for texlive-paracol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn49560"

RPM_NAME = "texlive-paracol-doc-2023.209.1.35svn49560-52.1.noarch.rpm"
RPM_HASH = "c02cbec2534fd3ada6475b9d92b1f4e6aec2c7036f428d84e37890086ffdd0560114d521c9279acc09b44de933183ed383b81a6aad71b0e315264c7623c1864a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paracol-doc"

RDEPENDS:${PN} += ""

inherit rpm
