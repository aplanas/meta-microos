SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2023.20230311.svn14752-93.1.aarch64.rpm"
RPM_HASH = "cbabb56421e2be8fcd824c96260118fa3d9db99b6289a5fd1d67a224ce5a0dbaedd643294b787c4549d8ebe26b1823714a709cffa64f8139d91175cba4ab93a0"

RPROVIDES:${PN} += "texlive-fig4latex-bin"

RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
