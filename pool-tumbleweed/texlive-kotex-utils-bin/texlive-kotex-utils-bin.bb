SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2023.20230311.svn32101-93.1.aarch64.rpm"
RPM_HASH = "31b668291f53948066e11e55d7830035c0d962f250df29a212ca84a2099426079a70576b01912a71010c0fb692bceb7b6e74fae391607b26b998de3941431de9"

RPROVIDES:${PN} += "texlive-kotex-utils-bin"

RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
