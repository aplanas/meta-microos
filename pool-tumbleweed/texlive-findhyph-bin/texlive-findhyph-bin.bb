SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14758"

RPM_NAME = "texlive-findhyph-bin-2023.20230311.svn14758-93.1.aarch64.rpm"
RPM_HASH = "e9faecfc7749b55ab4848b5b507d4c0755f35541377b0a0213b6f627ba83913fed72e23b6ab7089dbf1e988aa39915b54fcce68f6c98ac4c576abeb13b5e24e1"

RPROVIDES:${PN} += "texlive-findhyph-bin"

RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
