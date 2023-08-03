SUMMARY = "Documentation for texlive-lollipop"
DESCRIPTION = "This package includes the documentation for texlive-lollipop"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.07svn45678"

RPM_NAME = "texlive-lollipop-doc-2023.209.1.07svn45678-55.1.noarch.rpm"
RPM_HASH = "d2b6605b819ffb4326300abd009ae4f9ceffd71d387493cb85eb473cb988ad9ed6f96e1d92f106561802fbe6c9f5f8b713acb0f97c768ed153781513232a7f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lollipop-doc"

RDEPENDS:${PN} += ""

inherit rpm
