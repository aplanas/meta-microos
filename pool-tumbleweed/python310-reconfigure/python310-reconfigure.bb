SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python310-reconfigure-0.1.82-1.18.noarch.rpm"
RPM_HASH = "e142f8c51d37d04b93660ff846cafe4f102823e83e639782ddc563db33a542e0ab273e62cabe677679f57db8d81113aadc98b1f261155281cfe94e7e4e83d594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-reconfigure \
python310-reconfigure \
python3dist-reconfigure"

RDEPENDS:${PN} += "python-abi \
python310-chardet"

inherit rpm
