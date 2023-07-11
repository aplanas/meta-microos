SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-python-scripts-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "5d19ad2eb2a620c38c8769f0a316f2a2d6405c9668aca16963d4ef3404a7fc08b2b66a9ea0326f9d57427ea8c59bbf74cff264acf83fbaf08a8c845d6a784d51"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
