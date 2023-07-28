SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-python-scripts-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "eb20d30c9b338b05b41a10023cf1f3073cb789cf602e77be6497bc8d31b581a4490f06271e3f5540fc1cd293a099fb74dd3bf7914ce07213417af8de26a2cb2c"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
