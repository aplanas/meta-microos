SUMMARY = "CLI tool to deploy and manage SES clusters"
DESCRIPTION = "sesdev is a CLI tool for developers to help with deploying SES clusters. \
This tool uses vagrant and libvirt to create VMs and install Ceph using \
DeepSea. The tool is highly customizable and allows to choose different \
versions of Ceph and SES, as well as, different versions of the openSUSE \
based OS."
LICENSE = "MIT"

PV = "1.12.1+1619444076.g04475be"

RPM_NAME = "sesdev-1.12.1+1619444076.g04475be-1.6.noarch.rpm"
RPM_HASH = "a1a27bb77b42abcda9e632f06e2e07679e841fe74dff8e41f2cea16ad0140bc882f15b55ce80418c5d36ca698f067f94ac9b8778db3ec391bb5b1560faaf7488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(sesdev) \
python3dist(sesdev) \
sesdev"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
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
