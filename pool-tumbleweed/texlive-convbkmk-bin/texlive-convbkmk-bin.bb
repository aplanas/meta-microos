SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2023.20230311.svn30408-92.1.aarch64.rpm"
RPM_HASH = "c7db162f7f71d2246d6ce4f0d9ebe0aa494fc5a131fd9ff0bfcfdeea361e96ea6b81c3d683b79e166e71dfabc435471c6b1dc8cd14c62909dd00fbd853eedef5"

RPROVIDES:${PN} += "texlive-convbkmk-bin"

RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm
