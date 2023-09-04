SUMMARY = "Documentation for texlive-punknova"
DESCRIPTION = "This package includes the documentation for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-doc-2023.209.1.003svn24649-54.2.noarch.rpm"
RPM_HASH = "c491928128869b810cb1f9a932edda512fbaf118c016fe4dfe15acbcd5d1711fddd54cc53b9a08333c1657b5dc3870f46e8f0a009971d5306ef6cd8952bdd0ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
