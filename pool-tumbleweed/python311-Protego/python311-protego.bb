SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-Protego-0.2.1-2.5.noarch.rpm"
RPM_HASH = "0e95c6230fe3b40860afe5b91ddc6304cb1a8b826df8c5948dc9225cc1eded90422dbf120a5af3e910596940e321c8a315d3e4eabe117dcd2f0e711bc5629ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Protego \
python3.11dist-protego \
python311-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
