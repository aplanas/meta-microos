SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2023.20230311.svn44206-92.1.aarch64.rpm"
RPM_HASH = "c839f995295a9592ef380136601b30a4818a18555b006a64f58b73cf8855d0b7e9edf21f58fed0ce8e3d4724bed69a66124bddd9d310e893464c52fd1618b522"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin"

RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm
