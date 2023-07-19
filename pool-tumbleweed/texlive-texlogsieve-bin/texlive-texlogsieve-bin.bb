SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2023.20230311.svn61328-93.1.aarch64.rpm"
RPM_HASH = "b48c94ced264484946e1a90eba55c8fd9c08c9db96e785e2c93f921bd44e1ae2234d1bf09ebc55a006526350b9481a19f3b52ba3a6afe2c78784b0babcacb83e"

RPROVIDES:${PN} += "texlive-texlogsieve-bin"

RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm
