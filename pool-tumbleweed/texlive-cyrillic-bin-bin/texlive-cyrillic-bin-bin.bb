SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2023.20230311.svn53554-93.1.aarch64.rpm"
RPM_HASH = "85d635e00d2c8605338afcc1568fbc1dc998f96da019dc516fc750db9f52df81ccf0d30840f2cadfac373678930e17aafc01028eca87b722e0faa5e205f7e351"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin"

RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm
