SUMMARY = "API documentation for httpcomponents-client"
DESCRIPTION = "API documentation for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.12"

RPM_NAME = "httpcomponents-client-javadoc-4.5.12-2.7.noarch.rpm"
RPM_HASH = "0011416927b58b553e5959fba70fdcfd8ca25228f66b938410824de56d3aa16ba354a28b88fafc5a0f21e521b8a5218cfc35eae6c761ed92313340d690cab3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
