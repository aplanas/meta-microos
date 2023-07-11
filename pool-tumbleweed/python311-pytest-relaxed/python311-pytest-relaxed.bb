SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-pytest-relaxed-2.0.1-1.3.noarch.rpm"
RPM_HASH = "40c3784f307b586cf75945e224907f537bb564f5289e893c791f8529ee07edb07dee93ae9e6d987aab8160ee963dda2fdbbdf0a8dc037f6ccfb1ae47b4531bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-relaxed \
python3.11dist-pytest-relaxed \
python311-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python311-decorator \
python311-pytest"

inherit rpm
