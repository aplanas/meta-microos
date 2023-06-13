SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python39-extratools-0.8.2.1-2.12.noarch.rpm"
RPM_HASH = "e4459762ad16edd166a3a9f0bd9198683b4d9748946baf295023255497e912ae2a6096c4c156036e69fb3438c95d01b0a700c77643424231ada44220cf61cecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(extratools) \
python39-extratools \
python3dist(extratools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-RegexOrder \
python39-TagStats \
python39-sh \
python39-sortedcontainers \
python39-toolz \
update-alternatives"

inherit rpm
