SUMMARY = "Documentation for texlive-ibygrk"
DESCRIPTION = "This package includes the documentation for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.4.5svn15878"

RPM_NAME = "texlive-ibygrk-doc-2023.208.4.5svn15878-53.1.noarch.rpm"
RPM_HASH = "34c373d0658b3c101a1c328a416b1d42b46d9c48a895eeaa4f2eb91f6ee148ea868ac401467312222a9eea455b3e39e823392fdce9efa404977299fc79184313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibygrk-doc"

RDEPENDS:${PN} += ""

inherit rpm
