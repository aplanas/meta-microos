SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn57089"

RPM_NAME = "texlive-albatross-bin-2023.20230311.svn57089-92.1.aarch64.rpm"
RPM_HASH = "00b7b59be47face12fccb3e3a18cc6a137b4b08d480753b20270093b06ce3115798b39a26a1783f6bc667e8aa11f0337a5c1512679e2521567fcb6aa076fdaa0"

RPROVIDES:${PN} += "texlive-albatross-bin"

RDEPENDS:${PN} += "texlive-albatross"

inherit rpm
