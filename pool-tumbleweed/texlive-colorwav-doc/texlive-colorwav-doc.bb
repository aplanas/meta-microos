SUMMARY = "Documentation for texlive-colorwav"
DESCRIPTION = "This package includes the documentation for texlive-colorwav"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-colorwav-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "46eb1c455c9b87118a363ca321b3901c233e32617907b12db35266ae5aa2ef6a3e7a580490d71cfbb1d2772fcd658e097b49576e23e7a05da28ae8af44c1989c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorwav-doc"

RDEPENDS:${PN} += ""

inherit rpm
