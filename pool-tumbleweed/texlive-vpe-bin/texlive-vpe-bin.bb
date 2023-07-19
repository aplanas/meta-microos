SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6897"

RPM_NAME = "texlive-vpe-bin-2023.20230311.svn6897-93.1.aarch64.rpm"
RPM_HASH = "616e50ce643ceed2f9154148dce4c3f800a6badc0f07548f47e49161403d52c900c36943eaa148a00ef298a177d466fe24906c69a09f7f992e1659888a685bf4"

RPROVIDES:${PN} += "texlive-vpe-bin"

RDEPENDS:${PN} += "texlive-vpe"

inherit rpm
