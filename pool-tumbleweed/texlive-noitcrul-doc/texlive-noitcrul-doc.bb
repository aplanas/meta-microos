SUMMARY = "Documentation for texlive-noitcrul"
DESCRIPTION = "This package includes the documentation for texlive-noitcrul"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-noitcrul-doc-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "554afc0eeb7019eb7f1e9f78a5229c8ea3954724d09b23207f64d070622cc30532c41bef664bfa237ed76c05cb573511036bfd25ecd1b27417bc751b4886f59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-noitcrul-doc:de) \
texlive-noitcrul-doc"
RDEPENDS:${PN} += ""

inherit rpm
