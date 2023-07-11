SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python39-dogslow-1.2-1.16.noarch.rpm"
RPM_HASH = "4846d1af28f27ce8dac2cbda8d6350f26dd4779e87b5edd3fdb1ed91c34feb336cc1809a50a54dacf99b8d4f4d846e4115228ccbca8f8a8219612b4c82b2d9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dogslow \
python39-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
