SUMMARY = "Documentation for texlive-luaaddplot"
DESCRIPTION = "This package includes the documentation for texlive-luaaddplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62842"

RPM_NAME = "texlive-luaaddplot-doc-2023.201.1.0svn62842-52.1.noarch.rpm"
RPM_HASH = "86ee92a5e1613e803ebc31fc3fd9a1e976a6aa0f0f5b9fd63783c0b190751659d0e9726ea657b2c794a5ca45232a185a6d44cc071a9e210fd7cc1c56099c553b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaaddplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
