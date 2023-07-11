SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python310-compileall2-0.7.2-1.6.noarch.rpm"
RPM_HASH = "ec8e4f80f288268fbb774d95ad363e9311b3699fce2319c9eaad1a9024e4682a8b51c70765282748e4f85c8ace3dc7740ca9732625869d7597460a87a6ec68a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-compileall2 \
python310-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
