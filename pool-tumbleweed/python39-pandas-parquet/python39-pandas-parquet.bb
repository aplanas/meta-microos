SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-parquet-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a87988fcaced30829d32da3fe40df367cce7d62be4a2a8e5d052daae589b5b78b69c497228f5391ae962252d453bbdb098d27ef6660b39ba69652d0a2e7ceea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-parquet"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
