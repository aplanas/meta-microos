SUMMARY = "A FUSE file system for accessing Open Build Service instances"
DESCRIPTION = "oscfs is a FUSE-based user space file system for accessing Open \
Build Service (OBS) instances. It is based on the osc (openSUSE Commander) \
Python package for interfacing with OBS. At the moment, it provides read-only \
access for inspecting packages and their metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "fuse-oscfs-0.8.1-1.5.noarch.rpm"
RPM_HASH = "830a24bff8d66dc263f26fed8c0308e41db661c881d8780fd41afc0ae39333a65fab9b3e6481ffe7933229d8815e53eedd132c323f7de9f9bfd772e1d5d61b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuse-oscfs \
python2-oscfs \
python3.10dist(oscfs) \
python3dist(oscfs)"

RDEPENDS:${PN} += "/usr/bin/python3 \
osc \
python(abi) \
python3-fusepy"

inherit rpm
