SUMMARY = "Documentation for texlive-luaotfload"
DESCRIPTION = "This package includes the documentation for texlive-luaotfload"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.3.23svn64616"

RPM_NAME = "texlive-luaotfload-doc-2023.208.3.23svn64616-53.1.noarch.rpm"
RPM_HASH = "3142a4b006d076e44d7ff85f637a473b84e3ed6923e665d6be7bdf80e5cff1cedcee6a9e31caf243a42f3a7eaa6cf226992cb7e6db703f93286d6c6baf3f6d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luaotfload-tool.1 \
texlive-luaotfload-doc"

RDEPENDS:${PN} += ""

inherit rpm
