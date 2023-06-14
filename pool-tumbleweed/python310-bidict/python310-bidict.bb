SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python310-bidict-0.22.1-1.1.noarch.rpm"
RPM_HASH = "f1fa3c6f91872ccc0d12bb3310c7b641464487b13cbafd9dadb7ea8af95d619ce03a05ca5e9c0f2076cd5dfac813c0f44266f876a89477b56ffdcca53b088850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bidict \
python3.10dist-bidict \
python310-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
