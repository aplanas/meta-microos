SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2023.20230311.svn29348-93.2.aarch64.rpm"
RPM_HASH = "aab285b6822ab72ad81dcfc0f076cbfa80a58b99f422d5f8a025f5764a8055e6a4102a8fe03a943684683367616242bdc1f5e7931c900d3f005f6aa114587aac"

RPROVIDES:${PN} += "texlive-pfarrei-bin"

RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
