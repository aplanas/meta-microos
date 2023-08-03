SUMMARY = "Documentation for texlive-lhelp"
DESCRIPTION = "This package includes the documentation for texlive-lhelp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn23638"

RPM_NAME = "texlive-lhelp-doc-2023.209.2.0svn23638-55.1.noarch.rpm"
RPM_HASH = "e0d6b1fb6bcb2d40bd9296862177ec3d40e5fc91bf481cab2f7bdc80a1787b2c0a6ada57932585c5d4c948a1f54aee97b3aed8837be7fddda9ec859d4fa9213f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lhelp-doc"

RDEPENDS:${PN} += ""

inherit rpm
