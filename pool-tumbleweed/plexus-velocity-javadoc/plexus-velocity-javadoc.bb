SUMMARY = "API documentation for plexus-velocity"
DESCRIPTION = "This package provides API documentation for plexus-velocity."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "plexus-velocity-javadoc-1.2-4.7.noarch.rpm"
RPM_HASH = "04f0896d45387acd5fafc63cbf7a039635053131a92309e68305d69a6810fc7464c14eba6a76c09a99822535534fb8078ffc64f98e89740a448767ac442d6219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-velocity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
