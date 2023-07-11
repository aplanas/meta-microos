SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python311-py-vapid-1.9.0-1.6.noarch.rpm"
RPM_HASH = "fc25ed983bca22b6a03b84071294d6efd9668d53ed5b4eafb8d318ab3f9b58ea58507364487678f31705dca7c3aac1c77f4458fd13de3345c2f6cf6c53c1498c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-vapid \
python3.11dist-py-vapid \
python311-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
update-alternatives"

inherit rpm
