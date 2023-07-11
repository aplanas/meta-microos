SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-time-travel-1.1.2-3.7.noarch.rpm"
RPM_HASH = "e71f174f61de5f18e7c8987a93030094ff27f78759dd5a2529a9765a740de87429faeeb4d900c34b22e33e3ed3103c4f945ee16e8bfb2137106d41ff4a28232a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-time-travel \
python3.11dist-time-travel \
python311-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
