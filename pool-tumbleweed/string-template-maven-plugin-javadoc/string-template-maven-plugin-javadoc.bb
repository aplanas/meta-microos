SUMMARY = "Javadoc for string-template-maven-plugin"
DESCRIPTION = "API documentation for string-template-maven-plugin."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-javadoc-1.1-2.10.noarch.rpm"
RPM_HASH = "f5f22f9748c7b6ef837b23d5b34694504f97cfada6d1bec7d04a6257b97372ca5e4ec72f4132689fbd94dff9ab45038cf16cbe55f9ab5e0d6a607d7f0fe447a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "string-template-maven-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
