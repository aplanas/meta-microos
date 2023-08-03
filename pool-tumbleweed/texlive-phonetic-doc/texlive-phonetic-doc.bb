SUMMARY = "Documentation for texlive-phonetic"
DESCRIPTION = "This package includes the documentation for texlive-phonetic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56468"

RPM_NAME = "texlive-phonetic-doc-2023.209.svn56468-52.1.noarch.rpm"
RPM_HASH = "ce9ba9a635ccd8d35710cd1283f2cff6e87e14127e6b28a00219e4e769796a691db8a0b79b0dd1f0df97194a6240754f955cbcd2327f7188e5faf5199cff31b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonetic-doc"

RDEPENDS:${PN} += ""

inherit rpm
