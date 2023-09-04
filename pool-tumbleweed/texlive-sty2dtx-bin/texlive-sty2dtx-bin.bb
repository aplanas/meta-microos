SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2023.20230311.svn21215-93.2.aarch64.rpm"
RPM_HASH = "c96b94b5628592c129ba6cb555d03e9f855d01c9afb1f49b0487b52b0b010056462396a9704afd2271fa3590a170c93bcf969adf147762674c939ab88a465625"

RPROVIDES:${PN} += "texlive-sty2dtx-bin"

RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm
