SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2023.20230311.svn29741-92.1.aarch64.rpm"
RPM_HASH = "31d6ec64e6f0690479deb4f25f56984ad4507450233145a9480cb9097383ef3b0fc0e45fe931ebab7154b767504ae05d47b8b8df99118eb325433d3a4554233c"

RPROVIDES:${PN} += "texlive-texdoctk-bin"

RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
