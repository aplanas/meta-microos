SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python311-Babel-2.12.1-1.1.noarch.rpm"
RPM_HASH = "8247632466a61d6863ac47cb02cde1d440da433e5447957df05244e947877ed3e97dff37fb925f70486bf09870cc87212a51cf280811e0ab4f72f9ca076d8a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-babel \
python311-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python-abi \
python311-pytz"

inherit rpm
