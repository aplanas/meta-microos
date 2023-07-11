SUMMARY = "Data files for csound"
DESCRIPTION = "HRTF datafiles and Soundfont for csound"
LICENSE = "MIT"

PV = "6.18.1"

RPM_NAME = "csound-samples-6.18.1-3.2.noarch.rpm"
RPM_HASH = "afae4376d3a7af4c125569439cc09b54a4f2fa98efbe1818cb7b158316022b1267c62d87876279b98eab68f2afe486bc8f6e71bff1515243fce61dd5359ca24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-samples"

RDEPENDS:${PN} += ""

inherit rpm
