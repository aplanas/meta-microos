SUMMARY = "Tool to show origin of Ansible host context variables"
DESCRIPTION = "The Ansible inventory is a framework for declaring variables in a \
hierarchical manner. There a lot of different places where a variable \
can be defined. ansible-variables displays where host context \
variables originate from."
LICENSE = "GPL-3.0+"

PV = "0.5.0"

RPM_NAME = "ansible-variables-0.5.0-1.2.noarch.rpm"
RPM_HASH = "5a345854ed646f4c37148204f35e885347186fa0e113dca9381638254b4980a5640f3d21a4d5ccddbb1093eb29cf723998510913d65a866a7f3849d1b3cc1d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-variables \
python3.11dist-ansible-variables \
python3dist-ansible-variables"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ansible-core \
python-abi \
python3-rich \
update-alternatives"

inherit rpm
