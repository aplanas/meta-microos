SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-computation-2.0.3-1.3.noarch.rpm"
RPM_HASH = "de24ec8d514e8c120311113abf6d9e3b95c1a5fea9a4ab6ad96a4a9a8527065d1f5978f6b7ea65c40ed06b65762d2873b564d708b24faf99c0e32943467b7efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-computation"

RDEPENDS:${PN} += "python39-pandas \
python39-scipy \
python39-xarray"

inherit rpm
