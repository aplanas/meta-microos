SUMMARY = "Documentation for texlive-listings-ext"
DESCRIPTION = "This package includes the documentation for texlive-listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.209.67svn29349"

RPM_NAME = "texlive-listings-ext-doc-2023.209.67svn29349-55.1.noarch.rpm"
RPM_HASH = "991cfe6c3066618aff0055faa9245ddb2c4d41883e0b00dae7915327d7e0383770d7db2cd84600181e10f09b30e72eb212e75a370f80fdc47543b2b52133cfee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-ext-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
