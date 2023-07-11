SUMMARY = "A FUSE file system for accessing Open Build Service instances"
DESCRIPTION = "oscfs is a FUSE-based user space file system for accessing Open \
Build Service (OBS) instances. It is based on the osc (openSUSE Commander) \
Python package for interfacing with OBS. At the moment, it provides read-only \
access for inspecting packages and their metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "fuse-oscfs-0.8.1-1.6.noarch.rpm"
RPM_HASH = "4eb95e74fde46358c17cf5d73fb3d17b22eee054d505c7f037d49ec654d936db6f98c64ca550484e85371a4af42c276e3a6f08ba600c05bb956598193e3c815f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuse-oscfs \
python2-oscfs \
python3.11dist-oscfs \
python3dist-oscfs"

RDEPENDS:${PN} += "/usr/bin/python3 \
osc \
python-abi \
python3-fusepy"

inherit rpm
