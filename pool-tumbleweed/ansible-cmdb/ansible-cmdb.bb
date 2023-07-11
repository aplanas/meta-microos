SUMMARY = "Ansible Configuration Management Database"
DESCRIPTION = "Ansible-cmdb takes the output of Ansible's fact gathering and converts it into \
a static HTML overview page (and other things) containing system configuration \
information. \
It supports multiple types of output (html, csv, sql, etc) and extending \
information gathered by Ansible with custom data. For each host it also shows \
the groups, host variables, custom variables and machine-local facts."
LICENSE = "GPL-3.0-or-later"

PV = "1.31"

RPM_NAME = "ansible-cmdb-1.31-1.8.noarch.rpm"
RPM_HASH = "dad2a3732b89ab6ab6febcf0e12890c34f099b57621906334da5a27db64ff1524bcf4c660e097661b0ced06029b477b14385771b9aeb7f69c56f6d770423de44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-cmdb \
python3.11dist-ansible-cmdb \
python3dist-ansible-cmdb"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Mako \
python3-PyYAML \
python3-jsonxs"

inherit rpm
