SUMMARY = "Documentation for texlive-luaaddplot"
DESCRIPTION = "This package includes the documentation for texlive-luaaddplot"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn62842"

RPM_NAME = "texlive-luaaddplot-doc-2023.208.1.0svn62842-53.1.noarch.rpm"
RPM_HASH = "20503f6bae6375a193f86c349bc1bf4be0dde89c52798961a556dedf93a02396d0e5ecd3c9ecb1a93e2a5241ab83709c63e6fe5b14200b296dde7aa2513d0e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaaddplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
