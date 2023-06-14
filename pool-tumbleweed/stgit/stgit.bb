SUMMARY = "Stacked GIT - Source Code Management Tool"
DESCRIPTION = "StGIT is a Python application providing similar functionality to Quilt \
(i.e. pushing/popping patches to/from a stack) on top of GIT. These \
operations are performed using GIT commands and the patches are stored \
as GIT commit objects, allowing easy merging of the StGIT patches into \
other repositories using standard GIT functionality."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "stgit-1.5-1.7.noarch.rpm"
RPM_HASH = "f42a9a82d315c874940207681f6ff70a26a8f8b476bd6d871dbec3e9248f51536085c65e6d7b564d351e6e338cdf43329bbc834d4c748d133de10e9e5fde0187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stgit \
python3dist-stgit \
stgit"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
python-abi"

inherit rpm
