SUMMARY = "Ansible Configuration Management Database"
DESCRIPTION = "Ansible-cmdb takes the output of Ansible's fact gathering and converts it into \
a static HTML overview page (and other things) containing system configuration \
information. \
It supports multiple types of output (html, csv, sql, etc) and extending \
information gathered by Ansible with custom data. For each host it also shows \
the groups, host variables, custom variables and machine-local facts."
LICENSE = "GPL-3.0-or-later"

PV = "1.31"

RPM_NAME = "ansible-cmdb-1.31-1.7.noarch.rpm"
RPM_HASH = "e91552a26d325e43c9314d338ad7560f8cf77b2fd2ff2852253f4d6ab85e0c50ac6ab3c928eadf15625ffa547d97f42f413f11c8cd9fc1056649b729789bef6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-cmdb \
python3.10dist(ansible-cmdb) \
python3dist(ansible-cmdb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-Mako \
python3-PyYAML \
python3-jsonxs"

inherit rpm
