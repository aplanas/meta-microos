SUMMARY = "The plugin-driven server agent for collecting & reporting metrics"
DESCRIPTION = "Telegraf is an agent written in Go for collecting, processing, aggregating, and writing metrics. \
 \
Design goals are to have a minimal memory footprint with a plugin system so that developers in the community can \
easily add support for collecting metrics from local or remote services."
LICENSE = "MIT"

PV = "1.26.3"

RPM_NAME = "telegraf-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "22b72da1bca423b92e9598b8293f6d9498f28a1cad2828f251e72c1bcef44658820036f955f217f2351aa7998efc5b5620eb2a334d58dfa1775f8b0f1ff20142"

RPROVIDES:${PN} += "config-telegraf \
telegraf"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
