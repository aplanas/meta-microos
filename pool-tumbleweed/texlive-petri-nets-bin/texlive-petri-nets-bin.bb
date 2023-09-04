SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2023.20230311.svn39165-93.2.aarch64.rpm"
RPM_HASH = "72743ff86d421393432cb8ef3365ed74e47ed402b8e4d0df2c06578a8539fafbc2b920019416734eb1c6a076b449a1411d817e918ad4698a5bffdf4fa345174f"

RPROVIDES:${PN} += "texlive-petri-nets-bin"

RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm
