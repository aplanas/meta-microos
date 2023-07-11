SUMMARY = "API documentation for assertj-core"
DESCRIPTION = "This package provides API documentation for assertj-core."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "assertj-core-javadoc-3.8.0-1.23.noarch.rpm"
RPM_HASH = "049ecad15ffebfb3ba48d09c1da841de4ee8825c6a16a7d5fcc8f4bb6b7bf0e00a61446ba402562648e6b4dc879ac73ea788370f2f6f1855715736fbef4e4e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
