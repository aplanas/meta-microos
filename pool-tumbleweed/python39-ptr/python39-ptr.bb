SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python39-ptr-20.2.26-3.13.noarch.rpm"
RPM_HASH = "01b875694e99178ec2cf6f601fe06b22b3c3b697e96c0d3807b136c94cb398f7cc283d8219d68b3540b1ce11308bfa4f44eb8636a151038a3a1dc5d603a629e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ptr \
python39-ptr \
python3dist-ptr"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
