SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-falcon-3.1.1-2.3.noarch.rpm"
RPM_HASH = "f33455da43f39de4ed80870541d625316329002aade9ad6e573ce1868eca27a488dcf0edcc5af40314198424c9847186a108b5674d6c87bda75829043c07b8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-falcon \
python39-falcon \
python3dist-falcon"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
