SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-fss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "a4057df259d1e28e64de26b5d950a5230d82c11232fcfa3a8450a4bd3c94e495c27fda04085b936c69ed39b18a18554fbceaf234ec0034d5bd1c2ab0b7c87555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-fss \
python311-pandas-fss"

RDEPENDS:${PN} += "python311-fsspec \
python311-pandas"

inherit rpm
