SUMMARY = "Documentation for texlive-ku-template"
DESCRIPTION = "This package includes the documentation for texlive-ku-template"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-doc-2023.209.0.0.02svn45935-56.1.noarch.rpm"
RPM_HASH = "54b0ca064cae7dbb6e7eb336e90e2ec03b7c1d723b1bf6212b9c5cca902fae520669039c048ba66735ce14452ef8c4a7e6c9d2d0d4ef32f11e91a3450694c969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ku-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
