SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-fss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "a0ebf497bc7570ae26959254c2189eb0886792e8ffc64dfd095f757a507607ce3adfb2da44782aeae8f720f4fdc15dd959aa7d661e9908e6994f8115363911aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-fss \
python311-pandas-fss"

RDEPENDS:${PN} += "python311-fsspec \
python311-pandas"

inherit rpm
