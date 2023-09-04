SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2023.20230311.svn24759-93.2.aarch64.rpm"
RPM_HASH = "ec67c5c290a791c0ad46f1695013a120c7a98a2029e8a1f22aafc89a203fba3f08e81fe2d5cf20eac9b7709800e929bb88a5ebc44a0cca898195f9c615af75e1"

RPROVIDES:${PN} += "texlive-dosepsbin-bin"

RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm
