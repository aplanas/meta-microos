SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python39-setuptools-version-command-99.9-1.5.noarch.rpm"
RPM_HASH = "87d34e3d226f29d324d1763f51a2dba70af1ae960ba83859887dcc5823d0b539e6bd62c3a1abdc10415386a3cbaf71334dd51a27a1427ca2531a48dbab3580c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-version-command \
python39-setuptools-version-command \
python3dist-setuptools-version-command"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
