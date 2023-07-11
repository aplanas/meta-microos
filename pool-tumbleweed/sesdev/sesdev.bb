SUMMARY = "CLI tool to deploy and manage SES clusters"
DESCRIPTION = "sesdev is a CLI tool for developers to help with deploying SES clusters. \
This tool uses vagrant and libvirt to create VMs and install Ceph using \
DeepSea. The tool is highly customizable and allows to choose different \
versions of Ceph and SES, as well as, different versions of the openSUSE \
based OS."
LICENSE = "MIT"

PV = "1.12.1+1619444076.g04475be"

RPM_NAME = "sesdev-1.12.1+1619444076.g04475be-1.7.noarch.rpm"
RPM_HASH = "05a2112ff93cfda642fe0393e51d14be8bb8bd6f3f8f7f35d4a1395b1911c42f6c9a4fb530ef92fa8e7e170052fc2dd8cc062798da82eb288834ee34ef716e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sesdev \
python3dist-sesdev \
sesdev"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Jinja2 \
python3-PrettyTable \
python3-PyYAML \
python3-click \
python3-libvirt-python \
python3-pycryptodomex \
python3-setuptools \
sesdev-qa \
vagrant \
vagrant-libvirt"

inherit rpm
