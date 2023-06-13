SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2023.20230311.svn24062-91.1.aarch64.rpm"
RPM_HASH = "20440c9b1394448ebfd24ac740d79c9298c7e176ddce100ff0ffc4e421248bc11607810359d4890b532dd965a5adb3f56d7ddfe639f3c15eff96d354d80ff5fd"

RPROVIDES:${PN} += "texlive-texliveonfly-bin \
texlive-texliveonfly-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm
