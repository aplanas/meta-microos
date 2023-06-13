SUMMARY = "Documentation for texlive-romanbarpagenumber"
DESCRIPTION = "This package includes the documentation for texlive-romanbarpagenumber"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-doc-2023.201.1.0svn36236-53.1.noarch.rpm"
RPM_HASH = "1e9aaa3d4d777447f3e839c7eae19c2b1ed5ceb4da145b618127c3b3b03cb0d8bdccd8bb9668adb645238c0043544a5b39d4fa163cdc05d085a67a428a96cd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbarpagenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
