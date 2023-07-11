SUMMARY = "Stacked GIT - Source Code Management Tool"
DESCRIPTION = "StGIT is a Python application providing similar functionality to Quilt \
(i.e. pushing/popping patches to/from a stack) on top of GIT. These \
operations are performed using GIT commands and the patches are stored \
as GIT commit objects, allowing easy merging of the StGIT patches into \
other repositories using standard GIT functionality."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "stgit-1.5-1.8.noarch.rpm"
RPM_HASH = "e8d2c526e6d37b96edf87c8e832d51b1e23c3ce3339fca7f81869b5fa27aaea661fba00eba3a78dec2c94716a0157d79c835159a1e817d32ade41f97bbd6738e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-stgit \
python3dist-stgit \
stgit"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
python-abi"

inherit rpm
