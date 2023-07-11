SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-subst-0.4.0-3.17.noarch.rpm"
RPM_HASH = "f2274ca80280b68e9bbae8ca458f17bdc9ef85eaf8a6f4c5dcd8de666e92fd0191ee5d2a123cf2185db8117ce19662509dccfc9c36937ae4dd1f9f26637e56eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subst \
python310-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
