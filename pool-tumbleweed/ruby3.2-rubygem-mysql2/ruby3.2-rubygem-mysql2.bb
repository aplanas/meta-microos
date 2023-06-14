SUMMARY = "A simple, fast Mysql library for Ruby, binding to libmysql"
DESCRIPTION = "A simple, fast Mysql library for Ruby, binding to libmysql."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "ruby3.2-rubygem-mysql2-0.5.4-1.7.aarch64.rpm"
RPM_HASH = "7e2b4fb9aa5dd5d39e5438f574ed581640506185d5f94e9eff4762de110ac01e332f87ce7473569f0f3567f35110d448e7c407c78789e9f40177eb0ae5888f3e"

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
