SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24061"

RPM_NAME = "texlive-ctanify-bin-2023.20230311.svn24061-93.1.aarch64.rpm"
RPM_HASH = "88362df6dbe3f7513a7eaf756c93d50c41cadab3f7e3bf044812b5eb85707bfa7b7660091a868d77549595b965f6fd371cdfc2dc43b6d7985b249cb573f36a8a"

RPROVIDES:${PN} += "texlive-ctanify-bin"

RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm
