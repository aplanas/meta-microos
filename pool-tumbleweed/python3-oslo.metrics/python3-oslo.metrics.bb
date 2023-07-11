SUMMARY = "Common code to collect metrics data from other Oslo libraries"
DESCRIPTION = "This Oslo metrics API supports collecting metrics data from other \
Oslo libraries and exposing the metrics data to monitoring system. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python3-oslo.metrics-0.6.0-1.3.noarch.rpm"
RPM_HASH = "c71445a53e662d619906c4a7ab82e557ae3ded1e65ba8cc45c5fd42ffa3836fbc768ac372aeb257fd23abc7b7124954bdc82e0a23257ecc47cc83b3efb875043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.metrics \
python3.11dist-oslo.metrics \
python3dist-oslo.metrics"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-oslo.config \
python3-oslo.log \
python3-oslo.utils \
python3-pbr \
python3-prometheus-client"

inherit rpm
