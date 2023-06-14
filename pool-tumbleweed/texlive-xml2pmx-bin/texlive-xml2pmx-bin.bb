SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xml2pmx-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "a4aad7a038f5c523fdd97cfdf9aa8e1d0ab8671f07298b35bba70e255e47c188f1900a59f773b2f0fafb395a67588dafe991de61978cfea2d227dddeee34510e"

RPROVIDES:${PN} += "texlive-xml2pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-xml2pmx"

inherit rpm
