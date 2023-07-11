SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python39-xdoctest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "9594843910de56a2734d02d338118acc72aeb99dc3617c4ea70bf57ecf76ac61961ec56ada69b2292fccc91b381cc908c194aba8c527c4feac0b7d480c8fbbd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xdoctest \
python39-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
