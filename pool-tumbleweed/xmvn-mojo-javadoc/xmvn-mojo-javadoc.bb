SUMMARY = "API documentation for xmvn-mojo"
DESCRIPTION = "This package provides API documentation for xmvn-mojo."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-javadoc-4.2.0-4.1.noarch.rpm"
RPM_HASH = "a57db81417ec94f89191ed5a07a788e864307920f1e5ab19beafba047a9327db8967d018ac464f67c47103e187d692b24d22619949f567be462173faefb491a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
