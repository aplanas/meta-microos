SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python310-uniseg-0.7.2-1.2.noarch.rpm"
RPM_HASH = "f898ba64e6039d739af71824c5159f3a4cc33b262ef992feefac8d6fb50902583d1672242145e3186f3e74ae96238fead456585ddb2e27d02255b2f26a848758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uniseg \
python3.10dist-uniseg \
python310-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
