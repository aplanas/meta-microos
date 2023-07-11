SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2023.20230311.svn32101-92.1.aarch64.rpm"
RPM_HASH = "d78b620e8be029880d2bf6f35fe0dc58796060b5992d49f3ae724e41fd5b276524e959eedd268c2f26dfa3ce92544c72db696e52c308c7b5bc80ed291547f90b"

RPROVIDES:${PN} += "texlive-kotex-utils-bin"

RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
