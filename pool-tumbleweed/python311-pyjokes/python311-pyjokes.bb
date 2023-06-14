SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-pyjokes-0.6.0-2.13.noarch.rpm"
RPM_HASH = "a196da014e9a8d55d2e71d3e2f3be1a4fe462c2c13c38082d30ad4c0c550d7d18375654a0f04bb9c356d56ab18594a6f176af5c8d2b67994fdcd367f89228972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyjokes \
python311-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
