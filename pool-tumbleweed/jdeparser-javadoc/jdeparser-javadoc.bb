SUMMARY = "Javadoc for jdeparser"
DESCRIPTION = "This package contains the API documentation for jdeparser."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-javadoc-2.0.3-1.19.noarch.rpm"
RPM_HASH = "c308277c9de2023e0214fd19509947cd325d64e07b959bfa15395fe87527e9ba2c72eb6f856e1d6ddbd848b38d8f2dee157be200d1c28d1c82488eefaa2dfed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
