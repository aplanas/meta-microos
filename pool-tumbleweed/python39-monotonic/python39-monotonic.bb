SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python39-monotonic-1.6-1.8.noarch.rpm"
RPM_HASH = "b2eb488ad64c523e8d6427f8b6fa80ca98554413013841e4cdaad29beb6c9f3781659d1ee682f3adcc0a205fb07eb5d1dc0f4856d1026eed53e9a017607b668a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(monotonic) \
python39-monotonic \
python3dist(monotonic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
