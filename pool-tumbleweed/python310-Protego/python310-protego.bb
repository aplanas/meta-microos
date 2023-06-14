SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-Protego-0.2.1-2.3.noarch.rpm"
RPM_HASH = "0f5555963c9ca70a779ddf0c59bb30b4dc931cd0453d1cf3324b1d8a302cf7fe23bb58c0d41893f5a1602307a3da12b4f46451732ff765f6307ded591b298f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Protego \
python3.10dist-protego \
python310-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
