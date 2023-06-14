SUMMARY = "Tool to show origin of Ansible host context variables"
DESCRIPTION = "The Ansible inventory is a framework for declaring variables in a \
hierarchical manner. There a lot of different places where a variable \
can be defined. ansible-variables displays where host context \
variables originate from."
LICENSE = "GPL-3.0+"

PV = "0.5.0"

RPM_NAME = "ansible-variables-0.5.0-1.1.noarch.rpm"
RPM_HASH = "971ad2c740f0f9e0a0fb0620b37acad23ef64ed68f26cd7842c5ed640d964bc0ed3b9a2e3145edeeedac278e08114936f4000fe5e477a151ddbf39d080330f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-variables \
python3.10dist-ansible-variables \
python3dist-ansible-variables"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ansible-core \
python-abi \
python3-rich \
update-alternatives"

inherit rpm
