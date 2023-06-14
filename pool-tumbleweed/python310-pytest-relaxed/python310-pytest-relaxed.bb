SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-pytest-relaxed-2.0.1-1.1.noarch.rpm"
RPM_HASH = "8f31b4691b9e8260cd7a3922b5942a935e3ac08d8947f2456c42a3cc76f6a9e02cae526d7d5d54453d3aba2036290bb1f4ecc3081dd057372f69d0f87919babf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-relaxed \
python3.10dist-pytest-relaxed \
python310-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python310-decorator \
python310-pytest"

inherit rpm
