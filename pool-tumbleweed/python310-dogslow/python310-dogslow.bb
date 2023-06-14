SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python310-dogslow-1.2-1.14.noarch.rpm"
RPM_HASH = "e0b4158178c8bf7fbd904b329d32b25515678e6680f63fa011aaf13af285703d9a0255593ca5fb50ae1036235534dea3ac02d241b0d8e062740104f2125eba73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogslow \
python3.10dist-dogslow \
python310-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
