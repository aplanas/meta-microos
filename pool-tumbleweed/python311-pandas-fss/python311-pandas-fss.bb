SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-fss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "6bc704fe3446269b761b6d45325308d5ed80daddbc3d8101590a676d755ee06a8983a072c550139464436efcafb1464f75ecd31bdc15dbd4b7e5d5fa10b43593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-fss \
python311-pandas-fss"

RDEPENDS:${PN} += "python311-fsspec \
python311-pandas"

inherit rpm
