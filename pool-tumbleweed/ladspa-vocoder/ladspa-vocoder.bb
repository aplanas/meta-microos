SUMMARY = "LADSPA vocoder plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
vocoder plugin."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "ladspa-vocoder-0.4-1.4.aarch64.rpm"
RPM_HASH = "0e5b9b76d1a6abc466ce567d34a864866b9c2ea3c6518c6ddd69a5f2f0b52e0047072347778807fc16cc25c7a74c1612869832a027063afb51484f8c45042217"

RPROVIDES:${PN} += "ladspa-vocoder"

RDEPENDS:${PN} += "libm.so.6"

inherit rpm
