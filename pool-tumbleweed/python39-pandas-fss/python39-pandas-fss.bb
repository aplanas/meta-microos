SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-fss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "fafdfeedf47b4a5b6dd4acd82b14c3690f71ff50e9616d61082aa9fbfb3a7d29acef4ad47de244981e409105c3c2d76d333ba0a4d332fbea78d6754994fb4609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-fss"

RDEPENDS:${PN} += "python39-fsspec \
python39-pandas"

inherit rpm
