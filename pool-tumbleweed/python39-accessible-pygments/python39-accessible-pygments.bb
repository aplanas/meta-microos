SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python39-accessible-pygments-0.0.4-1.2.noarch.rpm"
RPM_HASH = "2160fa16a214394be7e77c5a7354aa0a8063dbf6dcc294b82c6de9cc9da50d72a1d50470be6d400f0bae5382d68f102c20ad8095531ab3f7eedec20d14908d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-accessible-pygments \
python39-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python39-pygments"

inherit rpm
