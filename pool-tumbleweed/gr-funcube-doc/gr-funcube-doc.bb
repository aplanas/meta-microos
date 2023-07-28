SUMMARY = "Documentation for gr-funcube"
DESCRIPTION = "Documentation for gr-funcube module for GNU Radio."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-doc-3.10.0.rc3-1.4.noarch.rpm"
RPM_HASH = "e7544c5e8331bf1874c8b5df6d9f676e2ba9a2d59de01f04cbb4a45c3b2d07bfd8c2bceeada3f3c568939a06783c435c9f4390cbe02f6c765ed5d2c78826d07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-funcube-doc"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
