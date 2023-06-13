SUMMARY = "Documentation for texlive-phonetic"
DESCRIPTION = "This package includes the documentation for texlive-phonetic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56468"

RPM_NAME = "texlive-phonetic-doc-2023.201.svn56468-51.1.noarch.rpm"
RPM_HASH = "955d70ba2546f7c740565ca07e169f040b0ca73d8a19249cb3252af001ffec87ecdb12d8fea3a086f059c39ef4fd7d0266a02b453057781923717976ffa288a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonetic-doc"

RDEPENDS:${PN} += ""

inherit rpm
