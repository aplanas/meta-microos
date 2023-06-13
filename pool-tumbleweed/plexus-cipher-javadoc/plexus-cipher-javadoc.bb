SUMMARY = "Javadoc for plexus-cipher"
DESCRIPTION = "API documentation for plexus-cipher."
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-cipher-javadoc-2.0-2.7.noarch.rpm"
RPM_HASH = "627f29963dbbf8d600de5d910f04651ac9bec175e20d95d58b75b6b6693dce3e488bb69cb1bfecf1f93872d1ecc9a4eefb7233ba6c48bac30a998ce61e8cafab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cipher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
