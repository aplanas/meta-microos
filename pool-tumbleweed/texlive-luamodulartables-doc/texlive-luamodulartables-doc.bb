SUMMARY = "Documentation for texlive-luamodulartables"
DESCRIPTION = "This package includes the documentation for texlive-luamodulartables"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65485"

RPM_NAME = "texlive-luamodulartables-doc-2023.208.1.0svn65485-53.1.noarch.rpm"
RPM_HASH = "2cd20dc9c94396781c74ef2cdd996d79d660f0b5ab4de54af57b5c00fa462818db0d2eee9d10a9ee54d597f4d3ebb158f57b5813cc3befad00526a6b11ac2daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamodulartables-doc"

RDEPENDS:${PN} += ""

inherit rpm
