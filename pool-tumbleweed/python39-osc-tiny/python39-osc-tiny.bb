SUMMARY = "Client API for openSUSE BuildService"
DESCRIPTION = "OSC Tiny provides a minimalistic, transparent and class based client for \
accessing the OpenBuildService API. \
 \
For further details see: \
 \
 * https://osc-tiny.readthedocs.io/en/latest/ \
 * https://openbuildservice.org/ \
 * https://build.opensuse.org/apidocs/index"
LICENSE = "MIT"

PV = "0.7.12"

RPM_NAME = "python39-osc-tiny-0.7.12-1.4.noarch.rpm"
RPM_HASH = "d9468556bce83b51d33e51957bfb3090b2444ece3bdb3c334cfc139d4f87676a50d79ab66866682cb23c530ec464021e8cbe7a9845d0cddcca616b716c6e3577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-osc-tiny \
python39-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-lxml \
python39-python-dateutil \
python39-pytz \
python39-requests"

inherit rpm
