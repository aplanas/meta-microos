SUMMARY = "Binary files of cslatex"
DESCRIPTION = "Binary files of cslatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-cslatex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "63a65f65fc7864048f97ced35c9c3e0ba5e57940b387b91d421bd780019c0bde7e3b4bcf6d1317fc12a49405226e562787b31394330117806732eb6864970c02"

RPROVIDES:${PN} += "texlive-cslatex-bin"

RDEPENDS:${PN} += "texlive-cslatex"

inherit rpm
