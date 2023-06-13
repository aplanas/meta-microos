SUMMARY = "Examples for javacc"
DESCRIPTION = "Examples for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-demo-7.0.11-1.5.noarch.rpm"
RPM_HASH = "576a26efafd0eb30e88c66116b3225d85229fb1cfa9b8adf3c7fa95b50e7680add9246abacc2cdf594a2275129522e4e0c1f3ecfdef0753d097a937cd885d2d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-demo"

RDEPENDS:${PN} += "javacc"

inherit rpm
