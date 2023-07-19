SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16219"

RPM_NAME = "texlive-bibexport-bin-2023.20230311.svn16219-93.1.aarch64.rpm"
RPM_HASH = "da0c9ba5108fdf358f3e5ced43a6a8266aadf3124a8da34c3d3e0a9535265ad778b3c4a733dfe5fdeb64989bd0faa1d7fcf1ad27f6697fbf58c3cb2679d31725"

RPROVIDES:${PN} += "texlive-bibexport-bin"

RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm
