SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-pyjokes-0.6.0-2.14.noarch.rpm"
RPM_HASH = "83864f2381dd5d5087c0da90faf17f352a29ef51c682eeb20ef0c95904ac33d85ffd15fec4d5e37379c0ce486be82ee8f8616553b8cf34ac9a9a572caef59cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjokes \
python39-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
