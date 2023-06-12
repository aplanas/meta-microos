SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-pyjokes-0.6.0-2.13.noarch.rpm"
RPM_HASH = "245f2603d7e7813e5e8746b83af568f9ec9109386d4110edcd6a19a2b39b1b1b1d23dbc31773e36ad8ae472758f9d65e6ed434dcd1bbdbd3abf2783788d11398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjokes \
python3.10dist(pyjokes) \
python310-pyjokes \
python3dist(pyjokes)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
