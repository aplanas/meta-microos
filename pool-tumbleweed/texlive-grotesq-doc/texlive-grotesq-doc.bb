SUMMARY = "Documentation for texlive-grotesq"
DESCRIPTION = "This package includes the documentation for texlive-grotesq"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn35859"

RPM_NAME = "texlive-grotesq-doc-2023.209.svn35859-54.1.noarch.rpm"
RPM_HASH = "06eb803e4446df444acae4591869b277ab814d9384a23e6b9614814294ddc8e2655a6fac7d4f7f0b2d6b7c2e730fd498165c6d73b7e45ba4f03199e87317ed9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grotesq-doc"

RDEPENDS:${PN} += ""

inherit rpm
