SUMMARY = "Manual for javacc"
DESCRIPTION = "Manual for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-manual-7.0.11-1.5.noarch.rpm"
RPM_HASH = "9240e147750c202680c775b6479dd89c4caf381cf87a1253805ecb34a90d8f58a87a9cfaf4faae63c9682af0efe4d8c5a341b9863f3645f768993fcc56932020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-manual"

RDEPENDS:${PN} += ""

inherit rpm
