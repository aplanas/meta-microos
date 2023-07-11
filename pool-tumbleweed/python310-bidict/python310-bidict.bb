SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python310-bidict-0.22.1-1.3.noarch.rpm"
RPM_HASH = "fdb7abe9e447bdf82799289c2f00a876a15c8cca5e2549943cae2e7bf69ef03ece0c0e00a53ad3b1c81d628d71aa53cd8b45d0da1dbab4a28c2380115b401bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bidict \
python310-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
