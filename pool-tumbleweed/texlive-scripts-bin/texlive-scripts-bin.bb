SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64356"

RPM_NAME = "texlive-scripts-bin-2023.20230311.svn64356-93.1.aarch64.rpm"
RPM_HASH = "d8b2c7d8467827b834d5182889832507da869547a8fc70322e9dd9e9b0a11efa267bce19a6a4e18239ed0a074059d452c4142d54e1383425a3c0dd3b7ef1af64"

RPROVIDES:${PN} += "texlive-scripts-bin"

RDEPENDS:${PN} += "texlive-scripts"

inherit rpm
