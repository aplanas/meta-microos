SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python39-srcinfo-0.1.1-1.6.noarch.rpm"
RPM_HASH = "db273ab092ccfbc0e16ba8b948e2de644a1b98cb89d29006d8c76e49dabec4b896000d542836a66ce0642e0087791ab1cd860252915fbcf11c3157922dde5a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-srcinfo \
python39-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-parse \
update-alternatives"

inherit rpm
