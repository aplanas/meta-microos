SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-panflute-2.3.0-1.2.noarch.rpm"
RPM_HASH = "1e4740934b33f880376db24ea8b02564b9a28aebcf374080bea34cf42f1e3a2fda4c52f6b898d4f20a63d838deeb714aec9225417c88191613714962e56170e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panflute \
python3.11dist-panflute \
python311-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-future \
update-alternatives"

inherit rpm
