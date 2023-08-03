SUMMARY = "Documentation for texlive-prerex"
DESCRIPTION = "This package includes the documentation for texlive-prerex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-prerex-doc-2023.209.svn54512-53.1.noarch.rpm"
RPM_HASH = "c2adb7b09c029ba9916b813512ad995aa957076f12a985630ee4a68481287596cfd1b578d1ac6151acfb2efd7011f4b2d075cebba2854d7addbb1cab4e2b795a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-prerex.5 \
texlive-prerex-doc"

RDEPENDS:${PN} += ""

inherit rpm
