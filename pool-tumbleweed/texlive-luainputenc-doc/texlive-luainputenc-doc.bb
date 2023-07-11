SUMMARY = "Documentation for texlive-luainputenc"
DESCRIPTION = "This package includes the documentation for texlive-luainputenc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.0.0.973svn20491"

RPM_NAME = "texlive-luainputenc-doc-2023.208.0.0.973svn20491-53.1.noarch.rpm"
RPM_HASH = "5d2f48cf32613fe30634a8dddcb3eead78fd407f626f0063d74885773e128c10b7c1044aa7d4f53dcd6d2398cbbf9e2f0385488345979850c80214e8f2cfd819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luainputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
