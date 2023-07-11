SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python311-pyrad-2.4-3.10.noarch.rpm"
RPM_HASH = "2fd77d9545913eaa49d79a9f387450f0079aeaf2f1bf0105f0ff45e086c260e8c0ea0ccb871aab296de2bfa383cc3f1fec02ffeec4be755d5cb1622baee5362e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyrad \
python3.11dist-pyrad \
python311-pyrad \
python3dist-pyrad"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
