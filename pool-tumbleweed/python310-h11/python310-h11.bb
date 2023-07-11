SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-h11-0.14.0-2.3.noarch.rpm"
RPM_HASH = "aa1a4239132588b0f141dcb3071ee99d3af22af87d0f16b84edf0adabd2e1b5d82ea2cc453f02675e12fe32c2ec8e1f83157428dc39a69884c436637c8dc88ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-h11 \
python310-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
