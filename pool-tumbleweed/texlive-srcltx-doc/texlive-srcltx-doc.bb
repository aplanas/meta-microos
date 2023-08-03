SUMMARY = "Documentation for texlive-srcltx"
DESCRIPTION = "This package includes the documentation for texlive-srcltx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-srcltx-doc-2023.209.1.6svn15878-58.1.noarch.rpm"
RPM_HASH = "ad66af0d03d33cbafd4e0042945aeae4317bbd9170b9aea62bb6aff34ab529983ab89a59d7640287781b9b238a1504c64c6132f12f42c0f1eeb55f9d5b703c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
