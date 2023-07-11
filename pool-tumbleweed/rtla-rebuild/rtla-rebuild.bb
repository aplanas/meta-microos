SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "rtla-rebuild-6.3.9-5.6.aarch64.rpm"
RPM_HASH = "36481ee91688228411b1327e96558f494e820acd6df38ca9980b505bccacef9f3cf7f245788120bdce719a12a90ee838c0884dc327646bfead5fb6f0d5845db6"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
