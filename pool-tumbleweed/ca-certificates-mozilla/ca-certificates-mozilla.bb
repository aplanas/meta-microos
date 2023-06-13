SUMMARY = "CA certificates for OpenSSL"
DESCRIPTION = "This package contains some CA root certificates for OpenSSL extracted \
from MozillaFirefox"
LICENSE = "MPL-2.0"

PV = "2.60"

RPM_NAME = "ca-certificates-mozilla-2.60-3.1.noarch.rpm"
RPM_HASH = "38f2df296f578b3980381bd4e1bf77d331918cf1a8fe085f4f902fb634b583dd855969db04bc524eb56b67719eedcfb9c47f0458efdc0a8c49d8c4ca131391ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla"

RDEPENDS:${PN} += "/bin/sh \
ca-certificates"

inherit rpm
