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

RPM_NAME = "python39-osc-tiny-0.7.12-1.2.noarch.rpm"
RPM_HASH = "0e61775727082cba9e811ed75faa73f32c8102c918388d32ab2fe7ba1b0db8b9b65a6d8898640559c645f1f3f44403da4f3d9a23e16a82086b84bb4831ad9c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(osc-tiny) \
python39-osc-tiny \
python3dist(osc-tiny)"
RDEPENDS:${PN} += "(python39-cached-property if python39-base < 3.8) \
python(abi) \
python39-PyYAML \
python39-lxml \
python39-python-dateutil \
python39-pytz \
python39-requests"

inherit rpm
