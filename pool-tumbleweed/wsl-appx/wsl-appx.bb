SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.630.aarch64.rpm"
RPM_HASH = "c678ff53d6abe9a5a063a7583401f0e81ca51a27531a55324e66021b62065829c93f1a61a912ff6f1afc94c8453cd571bd114a0f21bff783f919702e6e35d475"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
