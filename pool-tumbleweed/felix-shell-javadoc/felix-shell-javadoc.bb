SUMMARY = "API documentation for felix-shell"
DESCRIPTION = "This package contains API documentation for felix-shell."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-javadoc-1.4.3-4.7.noarch.rpm"
RPM_HASH = "5908c0e32c5ca5e8d0cff11c7f16862f512274424c312bd1ffac204682935c983ccc84e09f9685086ce945fbd3aebc4342d5bc3db534f1ba17bc114039371bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
