SUMMARY = "Documentation for texlive-uebungsblatt"
DESCRIPTION = "This package includes the documentation for texlive-uebungsblatt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-doc-2023.201.1.5.0svn15878-53.1.noarch.rpm"
RPM_HASH = "4f4cc7a7835ad588955a487d1746fd0d42752267f99b4cea2af63b229bfc04f9adf5bdc42c31ef7ec4f6887adc868f3c3266f2e942b02b730f024b5d17280d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-uebungsblatt-doc:de) \
texlive-uebungsblatt-doc"
RDEPENDS:${PN} += ""

inherit rpm
