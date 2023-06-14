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

RPM_NAME = "python311-osc-tiny-0.7.12-1.2.noarch.rpm"
RPM_HASH = "a77ce3a32293f4310826c4e8b33b003c9004f729e507bf45be625ca2216e55c518bb423f6e445835889b524795cf9e90f22dae6a8d36bb1273a3edca7c2b0682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-osc-tiny \
python311-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "-python311-cached-property if python311-base < 3.8 \
python-abi \
python311-PyYAML \
python311-lxml \
python311-python-dateutil \
python311-pytz \
python311-requests"

inherit rpm
