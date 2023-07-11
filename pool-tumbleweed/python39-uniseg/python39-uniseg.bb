SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python39-uniseg-0.7.2-1.4.noarch.rpm"
RPM_HASH = "77cb71ea3c14be5476c98160eb6d4e8fed97c0c5a5c655e03d3335ba5819f3f849e08da3f786c60e2e39acb622deac4fa785f2ca57efa08bbbe62c272e65aa92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uniseg \
python39-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
