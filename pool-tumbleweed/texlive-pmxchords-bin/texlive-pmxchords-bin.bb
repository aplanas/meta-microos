SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2023.20230311.svn32405-93.2.aarch64.rpm"
RPM_HASH = "ea4a66530450a75e8046200da41333f3df5a76889fd031f20903ad89aa099e3c81c39af957ef16ddf1aeb02cfebd5b9245497d489256d570135f072a62127f50"

RPROVIDES:${PN} += "texlive-pmxchords-bin"

RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm
