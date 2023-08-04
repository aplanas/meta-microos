SUMMARY = "API documentation for xmvn-connector"
DESCRIPTION = "This package provides API documentation for xmvn-connector."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-javadoc-4.2.0-4.1.noarch.rpm"
RPM_HASH = "980b98ef09b26cee7d833e1321594adbb60bcc06e74c77858879b94f6b950cd02d7681fba132798bc29631d0ab298d37d04d1434729696abc5c4fae41c0805ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
