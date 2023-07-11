SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python39-python-json-logger-2.0.7-1.2.noarch.rpm"
RPM_HASH = "69414dcce85fa31a05028f934179689f18fbf86cf12378f3c562d2cea8e60652b809c776b367237e366aae049826df125b99914455f77d107904344d84eed083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-json-logger \
python39-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
