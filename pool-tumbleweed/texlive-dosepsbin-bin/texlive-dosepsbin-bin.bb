SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2023.20230311.svn24759-93.1.aarch64.rpm"
RPM_HASH = "a8de6cfdcbde11d5a99ab67edf75ccf8dd54dad0aa8b95830d6f3cbff21ca11112ce8ae1f478086f67edb6215bf1676576fb46b392695ff7ca3d82d8910bf3cf"

RPROVIDES:${PN} += "texlive-dosepsbin-bin"

RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm
