SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43596"

RPM_NAME = "texlive-texosquery-bin-2023.20230311.svn43596-93.2.aarch64.rpm"
RPM_HASH = "898598b0764be934f729c00ab2cfd4cdcaa90e822c87497d479edc37745c038b87be8457564d4cde8dc0ed77e041082b3059efbc802457b6cbf4c7414b59d499"

RPROVIDES:${PN} += "texlive-texosquery-bin"

RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm
