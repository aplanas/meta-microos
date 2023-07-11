SUMMARY = "Documentation for texlive-luatexko"
DESCRIPTION = "This package includes the documentation for texlive-luatexko"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.5svn64893"

RPM_NAME = "texlive-luatexko-doc-2023.208.3.5svn64893-53.1.noarch.rpm"
RPM_HASH = "8372e6eb58e669b971951054522c0ab53e2444b66af58fd36a760022bd810cffab503e3a7da2db887c29bef40b0adc13d4ce5ddc261396b9189a7bdd7232d1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
