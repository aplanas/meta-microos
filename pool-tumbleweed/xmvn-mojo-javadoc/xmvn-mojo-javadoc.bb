SUMMARY = "API documentation for xmvn-mojo"
DESCRIPTION = "This package provides API documentation for xmvn-mojo."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-javadoc-4.2.0-3.1.noarch.rpm"
RPM_HASH = "70d303ea14c847796bdd5f6c47807bea76576bf3bf1aa8c3e8e0f3908e5a2dc805097154feae6dbf8dd80c835db6efd246a791ba3a08160cf7c2090b2e0c6f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
