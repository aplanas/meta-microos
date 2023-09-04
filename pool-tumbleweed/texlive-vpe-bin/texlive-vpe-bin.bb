SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6897"

RPM_NAME = "texlive-vpe-bin-2023.20230311.svn6897-93.2.aarch64.rpm"
RPM_HASH = "702c1ee3d616ac611700b8698ad66d8cff855d6e865c788edd6356e6d9ea131473e28d2f7a1161a8edb02689c0021f2476f65cdf01ecdc8db8b48f1945c49d66"

RPROVIDES:${PN} += "texlive-vpe-bin"

RDEPENDS:${PN} += "texlive-vpe"

inherit rpm
