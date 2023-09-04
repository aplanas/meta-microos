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

PV = "2.62"

RPM_NAME = "ca-certificates-mozilla-prebuilt-2.62-2.1.noarch.rpm"
RPM_HASH = "e8faf193cf34811def1f9d88ae62822c244ab406647f7cf62762a84dd37efbe45a276401f875e48a2c972d29618ba72ed7f63c8365ddf6e905bc3b075d4cf87b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla-prebuilt"

RDEPENDS:${PN} += "/usr/bin/cp \
/usr/bin/sh"

inherit rpm
