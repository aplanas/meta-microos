SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2023.20230311.svn15093-93.1.aarch64.rpm"
RPM_HASH = "18f9bc5fd95ebcf923279001435e1f54566fea7c0542a2437af659ebcfa4714161567b189d879c713eef36f58f9de2dcf270d09b758b8ab53d21caa6f721cceb"

RPROVIDES:${PN} += "texlive-listings-ext-bin"

RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
