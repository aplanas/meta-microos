SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python39-jaraco.itertools-6.2.1-2.3.noarch.rpm"
RPM_HASH = "a3790806e267b30e5df6084429bbdca384ca759c70e1e0936861a5ca655e9ef9d06ae71e41c6a2c513c38ba7a4fbe92c4bae358265c9f1d921e6aba147c8ebc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.itertools \
python39-jaraco.itertools \
python3dist-jaraco.itertools"

RDEPENDS:${PN} += "python-abi \
python39-inflect \
python39-more-itertools"

inherit rpm
