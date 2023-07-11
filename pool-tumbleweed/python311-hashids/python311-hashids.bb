SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-hashids-1.3.1-1.20.noarch.rpm"
RPM_HASH = "078dfcce084cac464b8bbdd4ad66c4910e031ebbda86da8750d7128c89f54defbf8bcc046eff4fd3966ce89dd91d803df2d9f19382acbff9313b256d747fdbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hashids \
python3.11dist-hashids \
python311-hashids \
python3dist-hashids"

RDEPENDS:${PN} += "python-abi"

inherit rpm
