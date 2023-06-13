SUMMARY = "SDR DSP primitives - Documentation"
DESCRIPTION = "A library with SDR DSP primitives headers - Documentation"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmo-dsp-doc-0.4.0-1.18.noarch.rpm"
RPM_HASH = "e92d2d167687b70ade22e80924bc61105fca76072e7293677e9ab78c8784cf38147f6935fa83e3fba9c39430956169ee9b92d617302e272b21576f029bd14b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosmo-dsp-doc"

RDEPENDS:${PN} += "libosmodsp0"

inherit rpm
