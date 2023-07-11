SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python310-scour-0.38.2-2.3.noarch.rpm"
RPM_HASH = "552855aac03dc9929b5c6d6221614c3b80ef29c6e31efd85a4a2cc1cc0719c82ef6da47bf6f71428f893f365e54685c0b8f22db246d0a5f830ca14224e4f26de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scour \
python310-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
