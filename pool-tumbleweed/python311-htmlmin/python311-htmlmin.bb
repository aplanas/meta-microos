SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python311-htmlmin-0.1.12-3.13.noarch.rpm"
RPM_HASH = "f06d5c69179694b4917be4497ed8cc339600c25b5a32095701a54cc9121d4df27bf81f5baccd9be1c49f634743816520062b3572a496d9549fabd676d58ae108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(htmlmin) \
python311-htmlmin \
python3dist(htmlmin)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
