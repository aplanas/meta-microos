SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-actdiag-3.0.0-1.7.noarch.rpm"
RPM_HASH = "02274540c26e82ed4ede86d54f19cde0bb8dee7840566b20274c51514e0dbaf9caba743036e92c2976d90310e5e4a2d3c9004b6b3db510538719144cf8ff1779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-actdiag \
python310-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
