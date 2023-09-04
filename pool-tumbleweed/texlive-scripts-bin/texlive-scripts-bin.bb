SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64356"

RPM_NAME = "texlive-scripts-bin-2023.20230311.svn64356-93.2.aarch64.rpm"
RPM_HASH = "35d719e0f5d6130818607e97096c79d3d170e57d8cffdd42c6629ce68359fdf917dd8a6ec7db3d3b0ce0d9d462cd911342790725fe4523029c8e3915b6b600c7"

RPROVIDES:${PN} += "texlive-scripts-bin"

RDEPENDS:${PN} += "texlive-scripts"

inherit rpm
