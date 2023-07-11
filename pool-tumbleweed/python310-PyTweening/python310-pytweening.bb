SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python310-PyTweening-1.0.4-1.4.noarch.rpm"
RPM_HASH = "35fb1eb7abbd561e75fa0503a4d2f950a52ecae3e5bd47a477c32cf1e6ec1cb3513ee1ed374ed764ad31cf4d02229e5a33ad5e3e845351de700b1a7da22246b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytweening \
python310-PyTweening \
python3dist-pytweening"

RDEPENDS:${PN} += "python-abi"

inherit rpm
