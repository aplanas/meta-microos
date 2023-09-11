SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-python-scripts-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "22899ed06ba67b07538de9add2766942a9c8ea5a3708dd80e21aa729b102b5bca45db91aa08ec11901ae7ef41f711a68d329cb151af355402c1931f79b7aaf81"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
