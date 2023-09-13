SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-fss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e11c27a0a8223d629a14d9f0953b8db354f5c22ca522f08be47a84d9cd03defc2d2e241b49debb4210e6db7e141214d0057652cae71bad6c15b0a2464276979a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-fss"

RDEPENDS:${PN} += "python39-fsspec \
python39-pandas"

inherit rpm
