SUMMARY = "A simple, fast Mysql library for Ruby, binding to libmysql"
DESCRIPTION = "A simple, fast Mysql library for Ruby, binding to libmysql."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "ruby3.2-rubygem-mysql2-0.5.4-1.8.aarch64.rpm"
RPM_HASH = "b4d09dc436dc7c4b9a52a36bdd39717d5bb9dd94038c848546e1d81b80b21c51889d05ef977ef3822aeaf7bcab3022b5c9a74fa351bd265665f09bec55e43761"

RPROVIDES:${PN} += "ruby3.2-rubygem-mysql2 \
rubygem-mysql2 \
rubygem-ruby-3.2.0-mysql2 \
rubygem-ruby-3.2.0-mysql2-0 \
rubygem-ruby-3.2.0-mysql2-0.5 \
rubygem-ruby-3.2.0-mysql2-0.5.4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmariadb.so.3 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
