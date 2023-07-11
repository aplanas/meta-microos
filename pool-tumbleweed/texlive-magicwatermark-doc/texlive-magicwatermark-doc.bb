SUMMARY = "Documentation for texlive-magicwatermark"
DESCRIPTION = "This package includes the documentation for texlive-magicwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn63656"

RPM_NAME = "texlive-magicwatermark-doc-2023.208.1.0.1svn63656-53.1.noarch.rpm"
RPM_HASH = "160f04a03e31718f848ff813aa17ffda4eab24ae589e415fdd63e0568681bcd6b6034762f673c66c79b5e578983ad489b08d50a1998b0fbfe65604fad93390c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-magicwatermark-doc-zh \
texlive-magicwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
