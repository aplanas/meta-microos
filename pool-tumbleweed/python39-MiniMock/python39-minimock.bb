SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-MiniMock-1.3.0-1.11.noarch.rpm"
RPM_HASH = "534e70d3419985a010fb3bda1fa7dd061cb133bde557769cadfa094f513e6c6e6f750545b98b1e70b7724eba75cfd1cafe2aa5eeecdf2a32eb2a21ad15245725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(minimock) \
python39-MiniMock \
python3dist(minimock)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
