SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53804"

RPM_NAME = "texlive-optex-bin-2023.20230311.svn53804-93.1.aarch64.rpm"
RPM_HASH = "5b7b3b08006afedd58e840721be635997c99b3525b210630437f78ab00bf883d0cbcbce60e085beb54c2ceb5e0bf90d74528ae944c289e1ec8e24374bc82e2c9"

RPROVIDES:${PN} += "texlive-optex-bin"

RDEPENDS:${PN} += "texlive-optex"

inherit rpm
