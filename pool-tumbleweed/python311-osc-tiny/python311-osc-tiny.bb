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

RPM_NAME = "python311-osc-tiny-0.7.12-1.4.noarch.rpm"
RPM_HASH = "308a8e9f51ade3b076571766e4d45aaf5041a352464bc84923a190584d95832dd333d3b177d483a0977e996beafe897356615211d2269d60b7ec50d9f22e79d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-tiny \
python3.11dist-osc-tiny \
python311-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-lxml \
python311-python-dateutil \
python311-pytz \
python311-requests"

inherit rpm
