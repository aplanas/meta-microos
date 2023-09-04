SUMMARY = "Documentation for texlive-pxfonts"
DESCRIPTION = "This package includes the documentation for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pxfonts-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "23e16a5d5278db63b1ba1f6e999616a7861c29a870792ec6b74478f446fc82e7152e56d0ce00fe68d27613b128b5c02d45c63a81d5f318f435cd9707e6a7e23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
