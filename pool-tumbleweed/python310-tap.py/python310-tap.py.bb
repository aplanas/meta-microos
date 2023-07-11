SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python310-tap.py-3.1-1.8.noarch.rpm"
RPM_HASH = "37191cb74276d2be7d17f5fe3bd05f2d980b8736f08389ea4c41e451daf66ae7a5f4b34627a10ac34b6ba22dcbb71098a0eb1140aec6846a3d2cd53e144c29d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tap.py \
python310-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
