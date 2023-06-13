SUMMARY = "A unified interface to key/value stores, including Redis, Memcached,"
DESCRIPTION = "A unified interface to key/value stores."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ruby3.2-rubygem-moneta-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "2495836fe1540d133b87308a18f2e63df64a105ff44bf1f012d4688e74c18ea36125ce7cfa8cae2b33e9965affab86b5ec3d939e4471f93097cd5a6ca5e989dc"

RPROVIDES:${PN} += "ruby3.2-rubygem-moneta \
ruby3.2-rubygem-moneta(aarch-64) \
rubygem(moneta) \
rubygem(ruby:3.2.0:moneta) \
rubygem(ruby:3.2.0:moneta:1) \
rubygem(ruby:3.2.0:moneta:1.5) \
rubygem(ruby:3.2.0:moneta:1.5.2)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
