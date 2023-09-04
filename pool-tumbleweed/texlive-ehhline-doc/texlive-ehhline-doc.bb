SUMMARY = "Documentation for texlive-ehhline"
DESCRIPTION = "This package includes the documentation for texlive-ehhline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54676"

RPM_NAME = "texlive-ehhline-doc-2023.209.1.1svn54676-54.2.noarch.rpm"
RPM_HASH = "ef048ead45fe93823e3f0c41e5cffd1221dc32461d1676898c78320dfa25c40dbd0d163a091d8f122a10206db2df4818a952d24be3429a0f506d4f07c6dcdc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ehhline-doc"

RDEPENDS:${PN} += ""

inherit rpm
