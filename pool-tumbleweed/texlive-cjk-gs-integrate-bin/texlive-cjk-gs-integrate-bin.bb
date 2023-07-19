SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2023.20230311.svn37223-93.1.aarch64.rpm"
RPM_HASH = "f9fa884b82884ccf3ca8f95a79c90cf7999645dac2554ace0c6ce45500f85292646085b42146fb890192cd17973f6910f13e7ba5dd6e43fdcd30848fe5b437c9"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin"

RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm
