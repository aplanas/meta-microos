SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-test-2.1.0-1.2.noarch.rpm"
RPM_HASH = "29606cd79b7fa2fcc124bde90cd02cb0764b453674a28c862b8d1ab9f317ab7f1ae96c484be729f6f7cb0a850be26bc205e1946965188f2eb7f314c89d812b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-test"

RDEPENDS:${PN} += "python39-hypothesis \
python39-pandas \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-xdist"

inherit rpm
