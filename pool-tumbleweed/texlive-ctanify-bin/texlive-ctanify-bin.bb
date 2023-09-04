SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24061"

RPM_NAME = "texlive-ctanify-bin-2023.20230311.svn24061-93.2.aarch64.rpm"
RPM_HASH = "b4ffdafa9890dc84ce3c88a9805dc27e717f4ce46cccd1ff2ce09a290d12f095275b2401ec3a2a3e1a656a4b23199bbdc7306402babc06d997e4eff476c2c297"

RPROVIDES:${PN} += "texlive-ctanify-bin"

RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm
