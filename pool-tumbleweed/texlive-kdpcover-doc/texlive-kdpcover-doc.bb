SUMMARY = "Documentation for texlive-kdpcover"
DESCRIPTION = "This package includes the documentation for texlive-kdpcover"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn65150"

RPM_NAME = "texlive-kdpcover-doc-2023.209.0.0.5.1svn65150-56.1.noarch.rpm"
RPM_HASH = "a34e8cb1c2d98a0c6a229b24998438b2a2cbebb0833dc8c9070769f32606a65049afc5817e5cef63a594cf7081bf5a50f63c583388cc64a761860a7170aef850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdpcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
