SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-asdf-transform-schemas-0.3.0-1.5.noarch.rpm"
RPM_HASH = "fac9dae69067d7a8a1b94d8d0b4ef60183975cae5dad80be0847bda3e5080fb7f67585554a7e16ae98b601c156004ada4e3823933a5f5a146a097e563ec754b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-transform-schemas \
python310-asdf-transform-schemas \
python3dist-asdf-transform-schemas"

RDEPENDS:${PN} += "python-abi \
python310-asdf-standard"

inherit rpm
