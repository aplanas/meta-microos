SUMMARY = "API documentation for osgi-core"
DESCRIPTION = "This package provides API documentation for osgi-core."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-core-javadoc-7.0.0-3.4.noarch.rpm"
RPM_HASH = "60eb759d07c049575a9ccc752941d0611543ac43744dc080162c6d587d9c2fa50652c414e6bb75dad0c5595acb471efe7ecf71aa5b83f572481a84a5dd3d8445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
