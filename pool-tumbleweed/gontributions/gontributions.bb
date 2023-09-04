SUMMARY = "Open source contributions lister"
DESCRIPTION = "Open source contributions lister."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gontributions-0.7.1-1.6.aarch64.rpm"
RPM_HASH = "313271e4eb968f1d4c0a6bf4463d613e166f1cae8a2701f08f69817318c6388b9caf93ce7e80c6c17617462e3f22941e9045b4c9f88cdeb9670913d87d12969b"

RPROVIDES:${PN} += "gontributions"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
