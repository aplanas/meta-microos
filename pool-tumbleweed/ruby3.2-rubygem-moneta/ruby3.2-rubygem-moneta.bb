SUMMARY = "A unified interface to key/value stores, including Redis, Memcached,"
DESCRIPTION = "A unified interface to key/value stores."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "ruby3.2-rubygem-moneta-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "da466f3f955c7e1528c0ed83145333489e184107f599b5c2e958760b3d439c250409f48b545511bd5eb883345cd03ab8127fb129f4c48d3c98e97fa79ecf0c18"

RPROVIDES:${PN} += "ruby3.2-rubygem-moneta \
rubygem-moneta \
rubygem-ruby-3.2.0-moneta \
rubygem-ruby-3.2.0-moneta-1 \
rubygem-ruby-3.2.0-moneta-1.6 \
rubygem-ruby-3.2.0-moneta-1.6.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
