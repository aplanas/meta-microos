SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python39-Babel-2.12.1-1.1.noarch.rpm"
RPM_HASH = "095538674ef44969300bf142a0f7a527ca8839a6172b33f810e3980ec39885e5d9f427a805cc73e16701f33d2540fb9850dd5bac813a159f5ea8ec0b5d34e6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-babel \
python39-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-pytz"

inherit rpm
