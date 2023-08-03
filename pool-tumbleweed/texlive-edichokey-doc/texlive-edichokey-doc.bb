SUMMARY = "Documentation for texlive-edichokey"
DESCRIPTION = "This package includes the documentation for texlive-edichokey"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-doc-2023.209.2.01ysvn56223-54.1.noarch.rpm"
RPM_HASH = "fd736ff61bef6464212e056212173aa10770168be49828f8b0f3fabb39d30f0e991ed5586d534a8e3cea6ed59fdcf1ea6eff11502e66b5ac1694045d1069c4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
