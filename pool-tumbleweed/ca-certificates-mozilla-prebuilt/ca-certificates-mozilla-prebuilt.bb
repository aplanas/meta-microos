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

RPM_NAME = "ca-certificates-mozilla-prebuilt-2.60-3.2.noarch.rpm"
RPM_HASH = "6d96bd5c66e78b6496f193a585d05cf82e2c40a7b2787eac9859a7864c310dc16e538356a5a0d6eea95632ce761a111535e4cd5114c680727bfe1440dbfdfcd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla-prebuilt"

RDEPENDS:${PN} += "/usr/bin/cp \
/usr/bin/sh"

inherit rpm
