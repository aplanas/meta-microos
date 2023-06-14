SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python310-scour-0.38.2-1.11.noarch.rpm"
RPM_HASH = "e968dcc78a282bcc318cc5af90491a82c6d4ed0c3fe65114f26e9c0a285623e6adc2908a3017591b1b7d47040f405f9f5587d8146ca85be43c27c1ea92170926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scour \
python3.10dist-scour \
python310-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
