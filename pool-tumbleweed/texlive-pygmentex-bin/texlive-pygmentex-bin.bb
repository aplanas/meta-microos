SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2023.20230311.svn34996-93.1.aarch64.rpm"
RPM_HASH = "25244b361d093153dbd5c2c513e9b6492cec13b98ba15979a5c4df0e2f8f437b7ac17226edf102245874865b4aba7eb08ec77b35d2e7345376354c3e1e904c96"

RPROVIDES:${PN} += "texlive-pygmentex-bin"

RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
