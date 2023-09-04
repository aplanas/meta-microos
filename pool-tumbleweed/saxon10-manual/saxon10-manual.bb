SUMMARY = "Manual for saxon10"
DESCRIPTION = "Manual for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-manual-10.9-1.1.noarch.rpm"
RPM_HASH = "ceb0d56b52c483435ac6315f7b19c2a9e7851f1723ebf56127892cd2a56425b907e46b4a2f923368d487703a1a5914b59501d43be6b072cde87fd28e9f29ca9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-manual"

RDEPENDS:${PN} += ""

inherit rpm
