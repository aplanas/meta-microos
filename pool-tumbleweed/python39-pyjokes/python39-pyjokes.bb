SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-pyjokes-0.6.0-2.13.noarch.rpm"
RPM_HASH = "1f0c3320c96feb927e77be0ea5c71fe1d522df3f17f5e2760639b2d067392026cd839cb4b5f70a5c6c843641a3ab59bfd508dda3476e3dd11744710640e94c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjokes \
python39-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
