SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-time-travel-1.1.2-3.7.noarch.rpm"
RPM_HASH = "fc2a72e832c3e5db34f4a6abd7b9d57b24936a1c73fa35d7709a26be59629f30e06a049639a29052565aab70cdeafd54b9b9f070e0b410b98c2f49b45b374d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-time-travel \
python39-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
