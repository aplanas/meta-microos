SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python310-hsluv-5.0.3-1.2.noarch.rpm"
RPM_HASH = "33d282ea02b55ad4cbdad44a98b5f7e2db0ec963f935890bbf31f838cbbf38f7be0ce6ba279d46c92c8a6412fd76bbd4787b874f142d62a258d3a8dcac52bf98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hsluv \
python3.10dist(hsluv) \
python310-hsluv \
python3dist(hsluv)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
