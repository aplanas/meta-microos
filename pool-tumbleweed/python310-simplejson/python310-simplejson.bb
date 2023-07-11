SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python310-simplejson-3.19.1-1.3.aarch64.rpm"
RPM_HASH = "75dca3996f2d1990493ed6c7035b5d75d5904428c079e95b3079a4498cc451f3576ba0698f2c6b6deb350a432b018b0d75378768c8de3c504d5bac7c4c407804"

RPROVIDES:${PN} += "python3.10dist-simplejson \
python310-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
