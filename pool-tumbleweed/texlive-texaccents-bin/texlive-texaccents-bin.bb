SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64447"

RPM_NAME = "texlive-texaccents-bin-2023.20230311.svn64447-93.1.aarch64.rpm"
RPM_HASH = "cc9891bcbb6b1a837e19841e414cfa7cddd64585dbf200aa1195a46e98f667882c36550f09676318fb7f3dadf2d6b993a9b59d8b5d1174151196587878610a69"

RPROVIDES:${PN} += "texlive-texaccents-bin"

RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm
