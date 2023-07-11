SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-MiniMock-1.3.0-1.12.noarch.rpm"
RPM_HASH = "374dc6f080b3af5636ca0e5a4f5d28b3aee87f67e055c4e7f5b137789b10b7d5f0d0c3ff76bda8c9cefeef970943fa0a1c107592d6f4cc74b71b7af778c02eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-minimock \
python39-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
