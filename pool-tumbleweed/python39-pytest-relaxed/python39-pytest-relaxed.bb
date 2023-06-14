SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-pytest-relaxed-2.0.1-1.1.noarch.rpm"
RPM_HASH = "0b8c1620102bad85a4ec07df3f89d6ac1db4d50de66b3529abb4e09838e034d7442c7f635ac48d337eceb330f6a56be0f6e7a4f8c50ddb4c3043e8c439e47432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-relaxed \
python39-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python39-decorator \
python39-pytest"

inherit rpm
