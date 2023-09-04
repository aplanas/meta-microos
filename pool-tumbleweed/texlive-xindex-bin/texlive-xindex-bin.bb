SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49312"

RPM_NAME = "texlive-xindex-bin-2023.20230311.svn49312-93.2.aarch64.rpm"
RPM_HASH = "ec4ed22899995425ecb0044617030a28514bcd0a606fff7514410e20c062c94a3db658760ac355e427577c5429c738e7ff9585570d2b985b0d7a37787c8de1b8"

RPROVIDES:${PN} += "texlive-xindex-bin"

RDEPENDS:${PN} += "texlive-xindex"

inherit rpm
