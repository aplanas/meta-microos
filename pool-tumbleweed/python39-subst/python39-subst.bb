SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-subst-0.4.0-3.15.noarch.rpm"
RPM_HASH = "67bc12aba976b559d026b9ad712208a60eece257598a40da4318c2b0dafc29815378a06dad5f471a86aea791d65dd9a83bccb4a39cc7b43e713a7610e7389a09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(subst) \
python39-subst \
python3dist(subst)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
