SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python310-check-manifest-0.49-3.1.noarch.rpm"
RPM_HASH = "3343be24fa78e6867365263abfa880e77d35bec05271cd5f25e8329d64547a35e5f404caf25dce5f7f6ee88f973e83661ba46e042f5be43dd0e2537ec1bbe1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-check-manifest \
python3.10dist(check-manifest) \
python310-check-manifest \
python3dist(check-manifest)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-build \
python310-setuptools \
python310-tomli \
update-alternatives"

inherit rpm
