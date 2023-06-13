SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-falcon-3.1.1-1.4.noarch.rpm"
RPM_HASH = "be77e1073498fc728fc33b228ffa0a5705fd018f9abc186047d702fbbb34d390bb0017f28764b11cd59171c27b344939392afdb694fb2464493d21e8db49247a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(falcon) \
python311-falcon \
python3dist(falcon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
