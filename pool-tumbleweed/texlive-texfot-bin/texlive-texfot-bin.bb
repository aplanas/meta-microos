SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33155"

RPM_NAME = "texlive-texfot-bin-2023.20230311.svn33155-91.1.aarch64.rpm"
RPM_HASH = "7227bd6003aa95548be5c66dd49fbb19a72aa1c76bf275ccc1656462e1d8296d82248da7002c09fb25ff70ec760553b81e187523ac8e09c2ff123ac41ede2352"

RPROVIDES:${PN} += "texlive-texfot-bin"

RDEPENDS:${PN} += "texlive-texfot"

inherit rpm
