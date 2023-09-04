SUMMARY = "Documentation for texlive-pxchfon"
DESCRIPTION = "This package includes the documentation for texlive-pxchfon"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9asvn66064"

RPM_NAME = "texlive-pxchfon-doc-2023.209.1.9asvn66064-54.2.noarch.rpm"
RPM_HASH = "e22e94e3255202797a353654018c54c33a07f089f1111a613c6172f105d9ebb9adb1c3cb125e1ceb145261208ff2d8135f7113600a934387a024d78e9191a8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxchfon-doc-ja \
texlive-pxchfon-doc"

RDEPENDS:${PN} += ""

inherit rpm
