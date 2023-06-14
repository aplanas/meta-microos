SUMMARY = "Python bindings for stp"
DESCRIPTION = "Python bindings for stp library."
LICENSE = "MIT"

PV = "2.3.3+20220915"

RPM_NAME = "python3-stp-2.3.3+20220915-1.3.noarch.rpm"
RPM_HASH = "446c9ac022ab90d59dd382372df549bb55ee9ebc428861743af03633f583830e7f97071f5922c0bd04a0f0116a379df124315fdd00390dfb9dbdb91c5915a8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stp"

RDEPENDS:${PN} += "libstp2-3 \
python-abi"

inherit rpm
