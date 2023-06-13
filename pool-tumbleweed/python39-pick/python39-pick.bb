SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-pick-2.2.0-2.1.noarch.rpm"
RPM_HASH = "befef1cfa8047d3d814361550a67b3ea02a58888d190254cd42252e12d93bc4cec6404f553355d0d4190b39e378c06dbbd64c50919c377458baef1a820b5720e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pick) \
python39-pick \
python3dist(pick)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
