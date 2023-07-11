SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-actdiag-3.0.0-1.7.noarch.rpm"
RPM_HASH = "b4c0b0f50f81410502272fb33c138a6ceaea972aab2b7564e5d88e74d8df1b9fae40d5cbcc9d6611c889b75e8c4f0baa594201c3045a901832d847ab441e1f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-actdiag \
python3.11dist-actdiag \
python311-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-blockdiag \
python311-setuptools \
update-alternatives"

inherit rpm
