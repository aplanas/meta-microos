SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34971"

RPM_NAME = "texlive-getmap-bin-2023.20230311.svn34971-91.1.aarch64.rpm"
RPM_HASH = "80e0bda9f395be7211bd77d8f018905003ab8008655f1a44203a499b71b76722004c1aeab5eeda8a820d9aa295594691d020a61ed2c09f0d26b850be9d415782"

RPROVIDES:${PN} += "texlive-getmap-bin"

RDEPENDS:${PN} += "texlive-getmap"

inherit rpm
