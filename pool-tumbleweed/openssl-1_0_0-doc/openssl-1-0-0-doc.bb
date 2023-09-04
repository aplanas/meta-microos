SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-doc-1.0.2u-22.1.noarch.rpm"
RPM_HASH = "f4731dcd813a1fd5fe468689e7a56c80aa84bc8111622ac878ba908301b35597f2fad9b10cf3952c1a8222e6ec22b16e0ac6e9073d9b0e570746936d3f748118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-0-0-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
