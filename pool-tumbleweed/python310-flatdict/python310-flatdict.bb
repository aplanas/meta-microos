SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python310-flatdict-4.0.1-3.8.noarch.rpm"
RPM_HASH = "a6613ec0d33565f2903d9359cc52feadac2a7e0937f78cf0142bb8e9d32df9c0e514eb8b4abaec128850974307c84737ec4bd4045efd8ba0a98499d13eafa7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flatdict \
python310-flatdict \
python3dist-flatdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
