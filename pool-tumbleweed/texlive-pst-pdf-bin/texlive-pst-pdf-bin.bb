SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2023.20230311.svn7838-92.1.aarch64.rpm"
RPM_HASH = "86e365e42aafc39ec91f19563168cd8beb6a6a0965bfb13ec86b5f385fef72577096c310504013e5f0ddd56526319fbdba25fb2f1b483cea2f6d0c3f574885c4"

RPROVIDES:${PN} += "texlive-pst-pdf-bin"

RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm
