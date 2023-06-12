SUMMARY = "Javadoc for truth"
DESCRIPTION = "This package contains the API documentation for truth."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-javadoc-0.24-3.10.noarch.rpm"
RPM_HASH = "4c12685be090a8b0cd0dfe130a2e85915adebdd033f88efd3865f26eda1d898799de063ac3feb60016e3d6d2875985840aaacd4308889a09af162e29df6c9f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "truth-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
