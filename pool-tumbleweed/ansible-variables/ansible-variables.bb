SUMMARY = "Tool to show origin of Ansible host context variables"
DESCRIPTION = "The Ansible inventory is a framework for declaring variables in a \
hierarchical manner. There a lot of different places where a variable \
can be defined. ansible-variables displays where host context \
variables originate from."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "ansible-variables-0.5.1-1.1.noarch.rpm"
RPM_HASH = "f13779c2743d0e8c565ae0a90422336987653be49d9038bfbe56589ed2050e23006f0717d3f1f58e84700854b599142b60a528ec2729e5f9f0074702288cc647"
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
