SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python310-fastimport-0.9.14-2.1.noarch.rpm"
RPM_HASH = "a4537f406ed12932a48a8170bba9b73f1a96592e81772fe54319b40b1b32829567cf3d3d6e4c9d7f8b26ad79a95b69763f48f7a25f3f978c04d18e253d5613fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastimport \
python3.10dist-fastimport \
python310-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
