SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python39-natsort-8.2.0-2.3.noarch.rpm"
RPM_HASH = "a3e4368c7845a24a86db776560b49a9a5ddf604e0d04f05e8f53b20ceefa7346a49a3c79fc0c9f3543e84d39b12743d34c02066dd2d60d1fadb1a792866dad0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-natsort \
python39-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
