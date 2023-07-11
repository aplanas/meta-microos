SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-time-travel-1.1.2-3.7.noarch.rpm"
RPM_HASH = "e9d150fb36e1a800fc16224b3d0133604eb8ba0eb8800ef0b13de9ba36b51d5c403641e7c3a6b0c18ed813afddc4e2a03c03fab1b9de1d18e6af5c8922dfd7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-time-travel \
python310-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
