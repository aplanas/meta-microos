SUMMARY = "Documentation for texlive-lollipop"
DESCRIPTION = "This package includes the documentation for texlive-lollipop"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.07svn45678"

RPM_NAME = "texlive-lollipop-doc-2023.201.1.07svn45678-54.1.noarch.rpm"
RPM_HASH = "67a72e0aa0e7febafff272ded752c27ff18557579843cdc1011db3da9d4dab65ee4c2a0dc3aba170607d6f9999283087919066fb7db080d4235f8ce5e87a8787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lollipop-doc"

RDEPENDS:${PN} += ""

inherit rpm
