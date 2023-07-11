SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python39-extratools-0.8.2.1-2.14.noarch.rpm"
RPM_HASH = "403bb49cc87f1472f90ac5ff6104ed98d7d4196aa5a5b8e76149b67eae6951692a48952ec0cf4a497c8d63828a22f89373cb68bd7b29ecf7f246640cdb38d9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-extratools \
python39-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-RegexOrder \
python39-TagStats \
python39-sh \
python39-sortedcontainers \
python39-toolz \
update-alternatives"

inherit rpm
