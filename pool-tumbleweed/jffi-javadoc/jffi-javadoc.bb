SUMMARY = "Javadoc for jffi"
DESCRIPTION = "This package contains the API documentation for jffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-javadoc-1.3.11-2.1.noarch.rpm"
RPM_HASH = "20d2f75df5cb1f14773342f8d32af1bb4a040251e7aea4e266ebcfaa439c304bd841c1b2d25a8f99d9db01bcab0e86c5176db43552dd7dfddd1bb3e3ba3c7cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jffi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
