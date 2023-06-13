SUMMARY = "API documentation for plexus-velocity"
DESCRIPTION = "This package provides API documentation for plexus-velocity."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "plexus-velocity-javadoc-1.2-4.6.noarch.rpm"
RPM_HASH = "154624ffaaae0f96d2cd6a8535f57d4842b1c1652062f389f2f7b1593bcbf39b8103a0cf4485574bd0eae29ac940e98e53180f793960e7ea90db0adc591857da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-velocity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
