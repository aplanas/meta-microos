SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38300"

RPM_NAME = "texlive-checklistings-bin-2023.20230311.svn38300-93.1.aarch64.rpm"
RPM_HASH = "2de60198ab7ea8d22b8d962c76ca5d75155ca006fab2c8d3e3a98499548bb7c0b0cf149c72b5968a7ffc99f52e619b40c6fa009f2c94d942d5a9c10f6e63f07b"

RPROVIDES:${PN} += "texlive-checklistings-bin"

RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm
