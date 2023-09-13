SUMMARY = "Javadoc for jackson-jaxrs-providers"
DESCRIPTION = "This package contains API documentation for jackson-jaxrs-providers."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "0f2aec727af224a6aad6f3fce62a0e11338a93464012e2ce7dd2c1e368482385506a1bc343e80667abf225b863339d629b3131468961c76fca1a7ee676c5b679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
