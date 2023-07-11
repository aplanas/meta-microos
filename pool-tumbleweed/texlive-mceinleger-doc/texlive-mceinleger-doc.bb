SUMMARY = "Documentation for texlive-mceinleger"
DESCRIPTION = "This package includes the documentation for texlive-mceinleger"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-mceinleger-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "0020513350d9d2ee941aebaa77adbf3c3ddbaa69b8e00deff9b71753d2977db4193a58e039bc35cfad5b3a114ac9fb7200afbdb40e6baf659dad91d846733010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mceinleger-doc"

RDEPENDS:${PN} += ""

inherit rpm
