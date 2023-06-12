SUMMARY = "Documentation for texlive-gsftopk"
DESCRIPTION = "This package includes the documentation for texlive-gsftopk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-doc-2023.201.1.19.2svn52851-53.1.noarch.rpm"
RPM_HASH = "caeb4e73b380a27a8218f1060891dbbc2ea98cfe7fec2abde2485b9a3b0b98fe10254f787bda80e92838f977d83c1a556f92a578ff0310f872909e43ef40989a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(gsftopk.1) \
texlive-gsftopk-doc"
RDEPENDS:${PN} += ""

inherit rpm
