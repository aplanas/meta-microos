SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2023.20230311.svn44835-93.2.aarch64.rpm"
RPM_HASH = "758c55d7fcbbc4ee106b9f2a07e8a8fa9b9f5e03e2dfc651c91042e264a08d593afa0ea3d6900e775c9105d8cf293c339532b7f2d50ab295244745d2982efe26"

RPROVIDES:${PN} += "texlive-jfmutil-bin"

RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm
