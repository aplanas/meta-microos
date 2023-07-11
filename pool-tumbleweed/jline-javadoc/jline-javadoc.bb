SUMMARY = "Javadocs for jline"
DESCRIPTION = "This package contains the API documentation for jline."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-javadoc-2.14.6-5.5.noarch.rpm"
RPM_HASH = "488f623bc5b018179544f648414a17a76493b60b58c4d1cf94edf770c5a12b301c4ed6e29db0bcbd987427f85c7ac6606553c2a8311d2feb6e550e2fdd42c199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
