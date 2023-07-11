SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python311-cu2qu-1.6.7.post2-1.6.aarch64.rpm"
RPM_HASH = "abcb453b912ca56458ac105305b0d055417e50f7b35398fe7fc31b18e4a567158146dcf325ed007ea4c7deb584e0e9e64e608ea62f3ef68b7b14aa3519637c64"

RPROVIDES:${PN} += "python3-cu2qu \
python3.11dist-cu2qu \
python311-cu2qu \
python3dist-cu2qu"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-FontTools"

inherit rpm
