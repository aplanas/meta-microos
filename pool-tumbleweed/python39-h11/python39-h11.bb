SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-h11-0.14.0-2.3.noarch.rpm"
RPM_HASH = "e7d6ad0b8429ade86c863d66b1df926a5b4bf2ac799960358f2a168f3e052a98980904d2ce5a867aa4ee6ea1e3604e1d88c1631e575ba85e04bd792f09acbd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-h11 \
python39-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
