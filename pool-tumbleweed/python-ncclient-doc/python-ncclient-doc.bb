SUMMARY = "Python NETCONF protocol library - Documentation"
DESCRIPTION = "This package contains documentation files for python-ncclient."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python-ncclient-doc-0.6.13-1.4.noarch.rpm"
RPM_HASH = "cbfa13641a49c091e555dc5c2fe5948ad8b2391f897e556066c5f614d123cd5bf435ee7c777d7344d49dd64816ffd6be135ba4f9a91f5d03e43be8ae2934962e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ncclient-doc \
python310-python-ncclient-doc \
python311-python-ncclient-doc \
python39-python-ncclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
