SUMMARY = "Documentation for texlive-datetime2-lsorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-lsorbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-doc-2023.209.1.1svn47749-53.1.noarch.rpm"
RPM_HASH = "a944521dd193c56752df647c1f1966d14060b2ffddb7dbb1f38ba64678ff621a075181daf8bb7e2222e1d1020a7c35deee664f925ad0614d91a964942ce49b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-lsorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
