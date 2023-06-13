SUMMARY = "Javadoc for glassfish-fastinfoset"
DESCRIPTION = "This package contains javadoc for glassfish-fastinfoset."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-javadoc-1.2.15-4.4.noarch.rpm"
RPM_HASH = "3b727c5392e934cd537f0064dfa542c9b3f9d34e7e1161bd928f4806ff569b888d895b490fff0774155e1cc686cd3bbbaec4328b91c13853e872621aa185221e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
