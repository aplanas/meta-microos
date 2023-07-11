SUMMARY = "API documentation for httpcomponents-core"
DESCRIPTION = "API documentation for httpcomponents-core."
LICENSE = "Apache-2.0"

PV = "4.4.13"

RPM_NAME = "httpcomponents-core-javadoc-4.4.13-2.7.noarch.rpm"
RPM_HASH = "b19aa93a45f605c2e5bf92c8d2412268ed3edf32f801d838fe009a8f7be871e63589b919c7f3f916f9d2e4e772e2a9f71f2d26ac6ffe5553fdc75288f266ea1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
