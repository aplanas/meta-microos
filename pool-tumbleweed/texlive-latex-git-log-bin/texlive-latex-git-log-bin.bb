SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2023.20230311.svn30983-92.1.aarch64.rpm"
RPM_HASH = "b8b33d742d89456a15ed462d8b6a57034a4226368145ba2172e2dbbe1709692c58508b4c2ba7e764c40ce33fe037aa386f16cbd7f260c143e66b9ce281a52ae8"

RPROVIDES:${PN} += "texlive-latex-git-log-bin"

RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
