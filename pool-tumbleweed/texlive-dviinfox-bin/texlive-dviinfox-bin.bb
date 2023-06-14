SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2023.20230311.svn44515-91.1.aarch64.rpm"
RPM_HASH = "1b1b04f8278ccb8b2fb662d2d07d618005128245fbd6af42e4dfc12debaeab77a21a48d823625cd3afbd6b9202186d82a2189e54265f5d29bf3ea7e8623f7128"

RPROVIDES:${PN} += "texlive-dviinfox-bin"

RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
