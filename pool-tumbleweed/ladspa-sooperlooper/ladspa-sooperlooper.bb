SUMMARY = "LADSPA sooperlooper plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
vocoder plugin."
LICENSE = "GPL-2.0+"

PV = "0.93"

RPM_NAME = "ladspa-sooperlooper-0.93-3.27.aarch64.rpm"
RPM_HASH = "af97ea365620d6c1afd8ed6aff90a194ddb8652f9679c89fa3624f0911ff639b6267efeb182ed8a42fc75b536be81f0fd38e6f713fab20dff7872f472bc18a35"

RPROVIDES:${PN} += "ladspa-sooperlooper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
