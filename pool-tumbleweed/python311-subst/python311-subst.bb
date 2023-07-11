SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-subst-0.4.0-3.17.noarch.rpm"
RPM_HASH = "9640b5408cdc61df5b5aaaa3087f8f9f27dbfe2634b6729310cd532e3d135ca02903db681048dc5a4e92d55c47380d62ceb3b4277c301a98c25bff71ba68b903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subst \
python3.11dist-subst \
python311-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
