SUMMARY = "Documentation for texlive-ibygrk"
DESCRIPTION = "This package includes the documentation for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.5svn15878"

RPM_NAME = "texlive-ibygrk-doc-2023.209.4.5svn15878-54.1.noarch.rpm"
RPM_HASH = "fade3aa6542d59a901952f4155d8acca6aa2d3640cff4d59f00701721f4bff1b346008ad07f1c4ec37bfbcdac140de705f9453742513f702cab6880f8a968506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibygrk-doc"

RDEPENDS:${PN} += ""

inherit rpm
