SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python39-scour-0.38.2-2.3.noarch.rpm"
RPM_HASH = "630866433266d0a862781d8b91be628807a15740174e4f634932688c809c702d91214c8957e329eda02d04298f0db8e0ebd9ccb91f8db32d1d6b71ecf78455ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scour \
python39-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
