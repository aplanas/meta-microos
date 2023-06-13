SUMMARY = "Documentation for gr-funcube"
DESCRIPTION = "Documentation for gr-funcube module for GNU Radio."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-doc-3.10.0.rc3-1.1.noarch.rpm"
RPM_HASH = "b67b651e576fe6c9968f32de041e5d1bb028a562a4a3c9d2578a5f174e0c8d19673a60f2c34d8fa1ad088bcbf3d1f940bd299083a0523d969f1e4473efa1c732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-funcube-doc"

RDEPENDS:${PN} += "libgnuradio-funcube3_10_0"

inherit rpm
