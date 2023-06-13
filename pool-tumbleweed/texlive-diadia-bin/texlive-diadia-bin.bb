SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37645"

RPM_NAME = "texlive-diadia-bin-2023.20230311.svn37645-91.1.noarch.rpm"
RPM_HASH = "2c5446a4c1270f46bc8d512a359dcfdf8d20f6e6a3ea3dfdcffacd00752612dcddff184c17512277ba7a3f2e2a78dae672a8cbd98cd5fac6e4369ba63a4037e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"

RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
