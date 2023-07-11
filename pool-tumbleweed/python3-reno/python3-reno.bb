SUMMARY = "RElease NOtes manager"
DESCRIPTION = "Reno is a release notes manager for storing release notes in a git \
repository and then building documentation from them."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python3-reno-3.5.0-1.8.noarch.rpm"
RPM_HASH = "e67bedc2969a71b2329372e9106f987bcbdabcab1d098e3bb2ce19631c30c3dd4afb105032c32174e9d666ecb760631813b0f03e48e69e37fb1a350280d0d7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reno \
python3.11dist-reno \
python3dist-reno"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-PyYAML \
python3-Sphinx \
python3-docutils \
python3-dulwich \
python3-pbr \
python3-six \
update-alternatives"

inherit rpm
