SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2023.20230311.svn30983-93.2.aarch64.rpm"
RPM_HASH = "e9772575227d06a12f4d5fa32898b54c04a77458239278e8059a1b1c52215e08b1ecc771210a2f70954fcf44b2db69a2cec7fde9a0601280b88e67b1bcf4394b"

RPROVIDES:${PN} += "texlive-latex-git-log-bin"

RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
