SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2023.20230311.svn29348-91.1.aarch64.rpm"
RPM_HASH = "f407e45a1242d115a85269bbb2a8db4f7e61ce3cc9a497ad258f990f49ed630a91dd94ffc4a9c47fed7cc773ac437bffe9c5d6c8ebeb7c37350f579e259b3600"

RPROVIDES:${PN} += "texlive-pfarrei-bin"

RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
