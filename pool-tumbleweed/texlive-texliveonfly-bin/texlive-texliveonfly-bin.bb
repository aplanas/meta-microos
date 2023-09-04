SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2023.20230311.svn24062-93.2.aarch64.rpm"
RPM_HASH = "62064a5ea24546b29e1de85651ae25e568de2611e5a5443f75244ca70f1fc880b518f0b882c5e32d065c9bf817cd56f1f0dd11c2814e4c71ce72245b83a3e4b5"

RPROVIDES:${PN} += "texlive-texliveonfly-bin"

RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm
