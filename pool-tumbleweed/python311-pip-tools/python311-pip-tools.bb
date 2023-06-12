SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.12.2"

RPM_NAME = "python311-pip-tools-6.12.2-1.2.noarch.rpm"
RPM_HASH = "0541d7a549c7b1c74ffaf21ce3e037af24c500f86a91c31483187f94bbfb4b17d7a702fe78639c48b60fee3eedc5033f2acf11ef5ee3500c1a971393c231a5fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-tools) \
python311-pip-tools \
python3dist(pip-tools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-build \
python311-click \
python311-pip \
python311-setuptools \
python311-wheel"

inherit rpm
