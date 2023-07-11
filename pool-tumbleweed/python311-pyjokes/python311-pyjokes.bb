SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-pyjokes-0.6.0-2.14.noarch.rpm"
RPM_HASH = "8e6eca1ecf9738747219e8e1d01a2110242b0aef6a658c8d8c7b6d25ca0f34d60afbb4c6ed9c673714bf2525eeacb60c60f3145fd8a739bb3ee6a44f64be544f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjokes \
python3.11dist-pyjokes \
python311-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
