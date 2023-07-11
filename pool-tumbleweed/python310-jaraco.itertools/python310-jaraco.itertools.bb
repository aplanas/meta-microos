SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python310-jaraco.itertools-6.2.1-2.3.noarch.rpm"
RPM_HASH = "16b8e056ac7d893a64d0f8449f1223d4092ef348c9566606354f36a37403d7e314a3809168e6d8f212f6b6a53c3cf763ecb616d8415ed685ef99676cfeed63b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.itertools \
python310-jaraco.itertools \
python3dist-jaraco.itertools"

RDEPENDS:${PN} += "python-abi \
python310-inflect \
python310-more-itertools"

inherit rpm
