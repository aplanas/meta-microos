SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38769"

RPM_NAME = "texlive-makedtx-bin-2023.20230311.svn38769-92.1.aarch64.rpm"
RPM_HASH = "4171cc91e0354d2805db114ac3e6662989c03617e0f6cb28608cf33b2ba6d963d798fabbd25868ec1fddbd2380011194c16c0c53727113bb933072301642847f"

RPROVIDES:${PN} += "texlive-makedtx-bin"

RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm
