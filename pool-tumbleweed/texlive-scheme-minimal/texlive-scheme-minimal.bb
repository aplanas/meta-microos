SUMMARY = "Minimal scheme (plain only)"
DESCRIPTION = "This is the minimal TeX Live scheme, with support for only \
plain TeX. (No LaTeX macros.) LuaTeX is included because Lua \
scripts are used in TeX Live infrastructure. This scheme \
corresponds exactly to collection-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-minimal-2023.208.svn54191-60.1.noarch.rpm"
RPM_HASH = "31fddbde125e7ebcd12ccdafbd3f00905865a0beed5b4077ff5302dfccbdffdda59de638f4ab7b01dee638183b8d5237cd7c3b349554714414118cbd2462901a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-minimal"

RDEPENDS:${PN} += "texlive-collection-basic"

inherit rpm
