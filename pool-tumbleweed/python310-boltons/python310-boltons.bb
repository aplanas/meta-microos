SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python310-boltons-21.0.0-2.3.noarch.rpm"
RPM_HASH = "07768a83c2e0ec7dd4e7bbe3a1ee76c00b6c51f5e23d7872e72b5634a2aad51264bf2f5df59fdc3ceeed217094bd24a2acce370b53cd95a145c37c3a322bc8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boltons \
python3.10dist-boltons \
python310-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
