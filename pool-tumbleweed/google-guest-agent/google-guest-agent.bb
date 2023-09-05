SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20230828.00"

RPM_NAME = "google-guest-agent-20230828.00-1.1.aarch64.rpm"
RPM_HASH = "81066d42f4fac94f3983b8a1b8d56bc959fe8cd6b114b494cf27a69292c0dc6d3a1d99282da3d184c6db0fa2215683abc8e83895b3ec489dece23c09a31882b9"

RPROVIDES:${PN} += "google-compute-engine-init \
google-guest-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs"

inherit rpm
