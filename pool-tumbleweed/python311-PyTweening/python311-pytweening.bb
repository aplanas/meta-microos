SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python311-PyTweening-1.0.4-1.3.noarch.rpm"
RPM_HASH = "7d6d31cc8c929be7ce24b085845b1e9becfa78b3d7e64d6840a051312eb027e5bd4d6182dd88196cf0129d27ae6a45795ac666e68f142bc576be624f8d823008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytweening) \
python311-PyTweening \
python3dist(pytweening)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
