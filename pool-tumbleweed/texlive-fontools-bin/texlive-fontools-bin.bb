SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25997"

RPM_NAME = "texlive-fontools-bin-2023.20230311.svn25997-92.1.aarch64.rpm"
RPM_HASH = "888f2c04694cd07b8331af4f325be86a49897abf64b224e1b7e89116c04515178fbc086a8814361b28e818870415ae9bb93253ffea8533345babc14c7bec7315"

RPROVIDES:${PN} += "texlive-fontools-bin"

RDEPENDS:${PN} += "texlive-fontools"

inherit rpm
