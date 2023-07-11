SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python39-PyTweening-1.0.4-1.4.noarch.rpm"
RPM_HASH = "fb9acc21783cb0d31b9890bab734d0c799dd8225e9fea676aa014819f9d772698c4cbe5ae4f37d94068486769c455e058daa8571e421f89969e911df6450ca42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytweening \
python39-PyTweening \
python3dist-pytweening"

RDEPENDS:${PN} += "python-abi"

inherit rpm
