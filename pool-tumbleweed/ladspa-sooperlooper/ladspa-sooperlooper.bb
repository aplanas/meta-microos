SUMMARY = "LADSPA sooperlooper plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
vocoder plugin."
LICENSE = "GPL-2.0+"

PV = "0.93"

RPM_NAME = "ladspa-sooperlooper-0.93-3.26.aarch64.rpm"
RPM_HASH = "a38fc1a7e76af01276cff20dc6895477aea4bbad7c57ee31a9fdfcface6b2856402cbf2dc62218f4075e8f9b31f6e0d197f458ae46aa791463398083bb97a220"

RPROVIDES:${PN} += "ladspa-sooperlooper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
