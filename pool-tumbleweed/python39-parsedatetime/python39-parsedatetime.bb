SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python39-parsedatetime-2.6-3.3.noarch.rpm"
RPM_HASH = "0e13794200e5a239b5881e70db7e66d60555aa3ad46d962b006cbef32388b3324c94f0e608345b9e1219f78a946a1f9147f7dbf807ae24a48d43fb58738b8d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsedatetime \
python39-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
