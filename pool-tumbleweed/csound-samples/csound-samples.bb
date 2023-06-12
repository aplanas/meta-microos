SUMMARY = "Data files for csound"
DESCRIPTION = "HRTF datafiles and Soundfont for csound"
LICENSE = "MIT"

PV = "6.18.1"

RPM_NAME = "csound-samples-6.18.1-3.1.noarch.rpm"
RPM_HASH = "de0d67da14f95fad02f0e0d58c2119c6c4355de03053075096641889858e5c4f755bc9a750fefc24b8d06f77e8a2fc595cf497d5b06b132986bdfb3c1e4f4654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-samples"
RDEPENDS:${PN} += ""

inherit rpm
