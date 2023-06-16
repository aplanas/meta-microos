SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python310-extratools-0.8.2.1-2.12.noarch.rpm"
RPM_HASH = "fe97c6ec3d077a62f17570bcdd470d6d8c5ae346fc18f2adfa92d2fd977371ee5ce7fa70381baa6fe03fe141b97424ba1cffaba0177c197a55a9d7ce3cfc2085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extratools \
python3.10dist-extratools \
python310-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-RegexOrder \
python310-TagStats \
python310-sh \
python310-sortedcontainers \
python310-toolz \
update-alternatives"

inherit rpm
