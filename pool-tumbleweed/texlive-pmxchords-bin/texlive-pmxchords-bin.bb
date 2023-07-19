SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2023.20230311.svn32405-93.1.aarch64.rpm"
RPM_HASH = "38676b13cacc598f69ea3551b95f766eb4946fe083e46a11e20b68591560535953672aefe37038a552fe680faf3e87179b3c08e62cb97c72932aeaa59c9f21e0"

RPROVIDES:${PN} += "texlive-pmxchords-bin"

RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm
