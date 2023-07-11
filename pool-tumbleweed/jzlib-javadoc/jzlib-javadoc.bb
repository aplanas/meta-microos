SUMMARY = "API documentation for jzlib"
DESCRIPTION = "API documentation for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-javadoc-1.1.3-5.7.noarch.rpm"
RPM_HASH = "53ba4f4af51654ee4969593b99258a050a1fbc40c04aa5b2c84613f811383f3df54e0ccdcfcb9c1f3c0e06de446e3de0b3f3e7dbad74f3abe1e701d7786c5a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
