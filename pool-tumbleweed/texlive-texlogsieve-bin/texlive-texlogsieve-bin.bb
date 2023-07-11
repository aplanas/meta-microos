SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2023.20230311.svn61328-92.1.aarch64.rpm"
RPM_HASH = "52eda34cb8fdb32b19a72772f156b06ab3274544255de02a3cd34e9d8e6078f1b37324e2e54a4a4379211b681d3d52cc18cd7559cb5008f216b87a783aa4df75"

RPROVIDES:${PN} += "texlive-texlogsieve-bin"

RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm
