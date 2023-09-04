SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-fss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "9c3191213ce6f256e659bfeefdea1423d23a89e503f0d109d703546904cffe6ba398f47fbf090ceb4aa72afbe73adb6a110939d4f206011f5bb7f5d087694962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-fss"

RDEPENDS:${PN} += "python39-fsspec \
python39-pandas"

inherit rpm
