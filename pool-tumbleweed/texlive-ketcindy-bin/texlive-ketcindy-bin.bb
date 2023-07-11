SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2023.20230311.svn49033-92.1.aarch64.rpm"
RPM_HASH = "3a0f3f15cf633b743f36ac6e441909696d1f89327eb77b588cfc41636d26c9968fa498dfceb7e9ae2354d439f36625f4558b1e1441ff4cc9421d1d17e0e5b775"

RPROVIDES:${PN} += "texlive-ketcindy-bin"

RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm
