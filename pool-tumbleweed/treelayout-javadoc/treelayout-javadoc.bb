SUMMARY = "Javadoc for treelayout"
DESCRIPTION = "This package contains javadoc for treelayout."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-javadoc-1.0.3-3.10.noarch.rpm"
RPM_HASH = "5ceb3e75b1e3890a6fd0bd6e6b15c855a2f53cd97498a2306e0b330e44f11f0d2637c8132784619dd965cddf25d026f52da20c48a186ecd20ca48e68c4bb59a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treelayout-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
