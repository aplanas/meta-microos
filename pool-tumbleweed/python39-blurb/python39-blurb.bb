SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-blurb-1.1.0-2.1.noarch.rpm"
RPM_HASH = "2da3fdabef00b60483b1a6817a5468efc0b43698ea57df438b95251eb812b883685431c9e4b9c0bca0e9bb19e3be342981faa1a6c4c7e0a978e3c1996973025c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(blurb) \
python39-blurb \
python3dist(blurb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
