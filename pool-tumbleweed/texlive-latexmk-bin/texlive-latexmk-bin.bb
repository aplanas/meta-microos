SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10937"

RPM_NAME = "texlive-latexmk-bin-2023.20230311.svn10937-93.2.aarch64.rpm"
RPM_HASH = "22af355178afa5b84a4a05e3c8412240d62caf7b56d11f27d51d4c39a7ec9a44c93c3ae7e85a7ca15216949fccf369769ef245710ae2cb24458f2b73033f4f88"

RPROVIDES:${PN} += "texlive-latexmk-bin"

RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm
