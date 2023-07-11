SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.13.0"

RPM_NAME = "python39-pip-tools-6.13.0-1.1.noarch.rpm"
RPM_HASH = "cc5b32be107660816ff8c09c135bad560aa9dcec94dd2ed94848d53f35f7ec690590ebcc3c5e080c294f36213c20ec32f9d060e5495fe83e163eee2d4a5f09a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip-tools \
python39-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-build \
python39-click \
python39-pip \
python39-setuptools \
python39-wheel"

inherit rpm
