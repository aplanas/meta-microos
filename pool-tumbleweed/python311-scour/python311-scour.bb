SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python311-scour-0.38.2-2.3.noarch.rpm"
RPM_HASH = "e22af6b5f3f2506a479b135b0a729c92a9b0c54facd421fe0531fda613e2cebcafa049956323d2efd21c180c3104b77662ca245233bee37fb5b829ce7ce892a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scour \
python3.11dist-scour \
python311-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
