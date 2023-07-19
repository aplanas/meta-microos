SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-xmltex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "52f6ad28db58d8c3b4a8a1f0799e650bb920d3a4dd0290296b4e8f9cf6dd3bb266df2b9f493a8334216caa5235dd5778640eb34594aea7eceacf80a40418676d"

RPROVIDES:${PN} += "texlive-xmltex-bin"

RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm
