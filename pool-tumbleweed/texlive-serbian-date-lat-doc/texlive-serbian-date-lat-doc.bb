SUMMARY = "Documentation for texlive-serbian-date-lat"
DESCRIPTION = "This package includes the documentation for texlive-serbian-date-lat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn23446"

RPM_NAME = "texlive-serbian-date-lat-doc-2023.209.svn23446-54.1.noarch.rpm"
RPM_HASH = "c7c66fe151a770edebd315f7e0c005ba1923f705e652f3766062911352da58f68814ce496e546b67eac44044e1a7aa3cf7a9c0eb4dc65ec2889025c2fb4734f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-date-lat-doc"

RDEPENDS:${PN} += ""

inherit rpm
