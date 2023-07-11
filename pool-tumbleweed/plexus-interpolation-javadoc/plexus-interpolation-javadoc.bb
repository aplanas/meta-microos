SUMMARY = "Javadoc for plexus-interpolation"
DESCRIPTION = "API documentation for plexus-interpolation."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.26"

RPM_NAME = "plexus-interpolation-javadoc-1.26-2.7.noarch.rpm"
RPM_HASH = "c31a658b682b1c821aac4fbb0e64d56d7111a1d5486b5948a8f3f07b19c78d9637001b4c65c9de4d730034caf3deaee1889a1078e3546623f1320489fedd5c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interpolation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
