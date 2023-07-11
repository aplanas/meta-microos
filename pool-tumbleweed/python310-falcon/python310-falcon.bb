SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-falcon-3.1.1-2.3.noarch.rpm"
RPM_HASH = "5e4da00ebb50af433af5015deff2abd580648772fc9c08f3f89494e837a82bbfd55247d7fcb0ffbb2b94a81f2882f92189ae93137e18f7028629f0bee9b89e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-falcon \
python310-falcon \
python3dist-falcon"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
