SUMMARY = "The plugin-driven server agent for collecting & reporting metrics"
DESCRIPTION = "Telegraf is an agent written in Go for collecting, processing, aggregating, and writing metrics. \
 \
Design goals are to have a minimal memory footprint with a plugin system so that developers in the community can \
easily add support for collecting metrics from local or remote services."
LICENSE = "MIT"

PV = "1.26.3"

RPM_NAME = "telegraf-1.26.3-1.2.aarch64.rpm"
RPM_HASH = "6d70efa1d38d0c85daff275d797b84e2f0a216872677da9dea4517e34ca0510e8b5ac80abfc8cf30ea877f5ac9a8f5ec4992ec2becfa6d64d17df502e988aba0"

RPROVIDES:${PN} += "config-telegraf \
telegraf"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
