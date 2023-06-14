SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-actdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "b9a1bcfad49c8c54c2ef6bb157891c4e9a1f74ede07e73f9beda515e6677abc766a375a6ef2866d987ef1a6b6064b5a43a63ecac228e7af70c905f32e604e06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-actdiag \
python39-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
