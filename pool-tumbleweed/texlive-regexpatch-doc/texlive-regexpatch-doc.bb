SUMMARY = "Documentation for texlive-regexpatch"
DESCRIPTION = "This package includes the documentation for texlive-regexpatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-doc-2023.209.0.0.2fsvn58668-54.1.noarch.rpm"
RPM_HASH = "6d88cba3366e30857c8953238db47accd84e5b32b4edbd1db1d0dd73377f13e768c14755c5344022128795e75813124f2270d94fbfceae67f8b8032b956351c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regexpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
