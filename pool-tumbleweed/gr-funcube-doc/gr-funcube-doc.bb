SUMMARY = "Documentation for gr-funcube"
DESCRIPTION = "Documentation for gr-funcube module for GNU Radio."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-doc-3.10.0.rc3-1.2.noarch.rpm"
RPM_HASH = "c7c96797fd7a57397cc9788f04c8ed4541779ac6f897e9b5de043e8c180d13a0b0b54589df97da7c40fedf5a43427f383ad20f1113dfb9068263c48a41975cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-funcube-doc"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
