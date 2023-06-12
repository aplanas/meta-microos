SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-mpl-animators-1.0.1-1.6.noarch.rpm"
RPM_HASH = "47ad23309641cbff6de3cbda9f4f11f8259c7b79bb2536a91e98ea9290c69d0f6468d0a248dcae166cb5a0dd3c91f8ca425ebe3d6323c15d5ddf4ea2c7e8137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mpl-animators) \
python39-mpl-animators \
python39-mpl_animators \
python3dist(mpl-animators)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy"

inherit rpm
