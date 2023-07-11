SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-pytest-relaxed-2.0.1-1.3.noarch.rpm"
RPM_HASH = "0e1062a0717198f975941f6947ff5c65e0b60cf5e701b925428a207c0eab0aa7abc0c5f3765880bc0fbdd9eaba71446d6ac25e8f605d92387ff4c849d7f5dd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-relaxed \
python39-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python39-decorator \
python39-pytest"

inherit rpm
