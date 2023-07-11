SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python311-extratools-0.8.2.1-2.14.noarch.rpm"
RPM_HASH = "50425d4ef19095d964062f29895c36a97b2bd57b646d6b877da14951c683f1e73e92143bf3de2a35fc0beff557a7fa6605f69f5399574aac40e91a5528b09038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extratools \
python3.11dist-extratools \
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
