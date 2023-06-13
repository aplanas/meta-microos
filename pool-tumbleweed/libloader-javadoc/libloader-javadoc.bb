SUMMARY = "Javadoc for libloader"
DESCRIPTION = "Javadoc for libloader."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "2fa2e7c9e64dc5098e61adff9de6fac60dd7f18d06afe1ec1c6442bc0ba6630375452cf5bb31981cee5db1e7493a2983b74e8172aea73a1f77c8c6de95d79196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
