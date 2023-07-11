SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python311-exrex-0.11.0-1.3.noarch.rpm"
RPM_HASH = "fccae8630cf55508def4501a85f94d5928c6b96e9e24f16965d7168c356fa4d13e13eca9ba8b726285598a64bfe90e657cca5f2fd7e9eb74c1c0fac277bc7dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exrex \
python3.11dist-exrex \
python311-exrex \
python3dist-exrex"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
