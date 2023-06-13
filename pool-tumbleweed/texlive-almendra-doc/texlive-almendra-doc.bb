SUMMARY = "Documentation for texlive-almendra"
DESCRIPTION = "This package includes the documentation for texlive-almendra"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64539"

RPM_NAME = "texlive-almendra-doc-2023.201.svn64539-54.1.noarch.rpm"
RPM_HASH = "93047645d28eaa1a499cd6f2af73da47bee58dec3d264e315adeaac2a487317cb0731e6300c7f7bb7643b679a15203963341a9dbf3f986c9b1c90afcdc4de175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almendra-doc"

RDEPENDS:${PN} += ""

inherit rpm
