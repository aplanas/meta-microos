SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-feather-2.0.2-4.1.noarch.rpm"
RPM_HASH = "dcff8f0eab9ea446a956ca74bb30df2acdcf69809867130f34f6c88963771c04ec3b32c4224d06a929d29847e9a62d526b8605bd0946d7f48f7ea58260559e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-feather"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
