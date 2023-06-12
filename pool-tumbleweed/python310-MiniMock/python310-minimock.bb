SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-MiniMock-1.3.0-1.11.noarch.rpm"
RPM_HASH = "6499cf9908148340ca89dc33dd0f58ddbb0244cc244afbcb66891fd5d9992150b869d6516292cb38ffc1655ea62f9992206f08062a963a07556adaba6e964a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MiniMock \
python3.10dist(minimock) \
python310-MiniMock \
python3dist(minimock)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
