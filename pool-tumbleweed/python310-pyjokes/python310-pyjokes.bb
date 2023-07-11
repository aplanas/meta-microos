SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-pyjokes-0.6.0-2.14.noarch.rpm"
RPM_HASH = "499e94c77c3865dae7718791cd6be7d623990f058fbc46d1c4a3d4103968f3851063a9cd347315565d43b2a3ff71bff3fac1d8c6cb9e9606af82ab701da37664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjokes \
python310-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
