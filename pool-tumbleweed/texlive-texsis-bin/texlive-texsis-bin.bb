SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-texsis-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "f188adc1a04ef7268fcd67f0ae73fca082cad9c6331d1f5decc8c8b364e2e7eaade2545c9b61c5167476508e08aec82d0325cc03673c2f63e70e623579c51988"

RPROVIDES:${PN} += "texlive-texsis-bin"

RDEPENDS:${PN} += "texlive-texsis"

inherit rpm
