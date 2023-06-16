SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-subst-0.4.0-3.15.noarch.rpm"
RPM_HASH = "01258af1d23534388269959344ba6505ec8c54d0b333500271bfabf4dc26c8a0fcc104ccc8a2ded1b172b6c04ae14cb2673084004882e2b25280da3bd68d8cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-subst \
python311-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
