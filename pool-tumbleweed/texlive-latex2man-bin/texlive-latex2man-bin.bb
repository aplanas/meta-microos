SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-latex2man-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "77ff7a46a659a831e96f731acc5c7f5430e3a776b05a87281e9d932864bc4a8b3855d9cf0e830fdda3dff676b1b5cc1bb81e744b27dd2102f34d11c0b9c90111"

RPROVIDES:${PN} += "texlive-latex2man-bin"

RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
