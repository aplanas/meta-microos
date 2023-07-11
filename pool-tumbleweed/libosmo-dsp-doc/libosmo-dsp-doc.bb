SUMMARY = "SDR DSP primitives - Documentation"
DESCRIPTION = "A library with SDR DSP primitives headers - Documentation"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmo-dsp-doc-0.4.0-1.19.noarch.rpm"
RPM_HASH = "ae6e88d9dbfa622b3ea11577e7608dcc047798788cf25dcac7a402c1864adf9266b686b92857bab6c1258fc1a9a903295cc00521c8a6b72c2cced6c573d0db04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosmo-dsp-doc"

RDEPENDS:${PN} += "libosmodsp0"

inherit rpm
