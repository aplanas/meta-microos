SUMMARY = "Javadocs for joda-time"
DESCRIPTION = "This package contains the API documentation for joda-time."
LICENSE = "Apache-2.0"

PV = "2.10.1"

RPM_NAME = "joda-time-javadoc-2.10.1-2.7.noarch.rpm"
RPM_HASH = "42b62416b300b218ba26849293d4de26b69a3f2dd52889136f40916a80c858a31b91a84a0f3cc6ea2ba7948f930dcad621751c0e7fca047d00b235e3a34ab266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
