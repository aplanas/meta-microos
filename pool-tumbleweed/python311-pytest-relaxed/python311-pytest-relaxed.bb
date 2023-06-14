SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-pytest-relaxed-2.0.1-1.1.noarch.rpm"
RPM_HASH = "d0ccc3b2542fb146da18690c58aedf5db9b899e77f4a7fd62796e14bce9421c9b7450a6e429378a89ffca300088e38106189a48e6fe9e2b3d73ef072a3033d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-relaxed \
python311-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python311-decorator \
python311-pytest"

inherit rpm
