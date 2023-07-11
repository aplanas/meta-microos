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

RPM_NAME = "python310-osc-tiny-0.7.12-1.4.noarch.rpm"
RPM_HASH = "14080aed0a3ee8d1593078ce06a54b125c6850482ddd1f0dae944dd3015aa91126843f72353dab1a71a285e649bc5aea421a9f30c61099af8fd4dd5efed256e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-osc-tiny \
python310-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-lxml \
python310-python-dateutil \
python310-pytz \
python310-requests"

inherit rpm
