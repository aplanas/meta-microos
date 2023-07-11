SUMMARY = "Ruby bindings for libcaca"
DESCRIPTION = "All that is needed to use libcaca from ruby code."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca-ruby-0.99.beta20-1.5.aarch64.rpm"
RPM_HASH = "9d029bbfbea8a97a6614dfbc46a2734468530b93fc0c615e4eaad2639b364a395f23e138e1f73f80cfd55d60edda38a9ad12e5656ec948c88cdc6eadd1a16a10"

RPROVIDES:${PN} += "libcaca-ruby"

RDEPENDS:${PN} += "libcaca \
libcaca.so.0 \
libruby3.2.so.3.2 \
ruby"

inherit rpm
