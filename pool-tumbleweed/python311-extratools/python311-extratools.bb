SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python311-extratools-0.8.2.1-2.12.noarch.rpm"
RPM_HASH = "b703a74811e9c125fb0c1f20a5965e38747c5c1114480bc8ed95a2407e58490890feaefb71560759cdb5d895a65448fd8086e62a37e66fc343f2892d227488ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-extratools \
python311-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-RegexOrder \
python311-TagStats \
python311-sh \
python311-sortedcontainers \
python311-toolz \
update-alternatives"

inherit rpm
