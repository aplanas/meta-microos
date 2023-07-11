SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-actdiag-3.0.0-1.7.noarch.rpm"
RPM_HASH = "e6dfbd75c5b9b541fd5bb359a86c5119cefa600c39e420aaba71ff7c3707c8937e99f4068671acbf90565edfb146b758cb28918a9c60fc7f14b34d21de360d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-actdiag \
python39-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
