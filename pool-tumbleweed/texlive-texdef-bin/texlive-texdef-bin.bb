SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45011"

RPM_NAME = "texlive-texdef-bin-2023.20230311.svn45011-92.1.aarch64.rpm"
RPM_HASH = "3cc3de3073d49cbb53393284975dfea25e879fd8bc316b8e36d7adbb74efdc493d646f7bc83948797871313d66d36f71ee5a03003d726b1f9e0c3db1b597200f"

RPROVIDES:${PN} += "texlive-texdef-bin"

RDEPENDS:${PN} += "texlive-texdef"

inherit rpm
