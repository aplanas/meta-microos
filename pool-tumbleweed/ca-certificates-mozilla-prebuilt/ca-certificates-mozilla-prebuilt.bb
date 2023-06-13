SUMMARY = "Pre-built CA certificates for OpenSSL"
DESCRIPTION = "This package contains a static set of CA root certificates for \
OpenSSL extracted from MozillaFirefox for use in containers. The \
package pre-fills /var/lib/ca-certificates with a static set of \
certificates if /var/lib/ca-certificates does not exist yet. \
 \
Therefore an upgrade of this package will NOT update the list of \
root CA certificates in the system. \
 \
It it not possible to configure additional root CA certificates \
using this package. \
 \
The package is only intended for use in containers that want to \
avoid installing p11-kit. \
 \
For all other use cases please install the \
'ca-certificates-mozilla' package."
LICENSE = "MPL-2.0"

PV = "2.60"

RPM_NAME = "ca-certificates-mozilla-prebuilt-2.60-3.1.noarch.rpm"
RPM_HASH = "5071d8a86cfc2b600aff8d91ffe37d13f800ad75f1da2be6feb9ec5e60285ff5c86c7e862feb7b9508d46564d197c129d53cbbe7b0370b9652674ce30ca7ffbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla-prebuilt"

RDEPENDS:${PN} += "/bin/cp \
/bin/sh"

inherit rpm
