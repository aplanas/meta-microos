SUMMARY = "Javadoc for glassfish-hk2"
DESCRIPTION = "This package contains API documentation for glassfish-hk2."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-javadoc-2.5.0-2.3.noarch.rpm"
RPM_HASH = "42e40c6e5e4b0357ef03d4342ff85f7e16fae34645a4d13a73decb113055a13f07ec498ac48d59d3b866dcb93d0f979f119f6efa5fd52b1b2ff8f5f8dd31c73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
