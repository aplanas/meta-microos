SUMMARY = "Python Bugzilla Interface"
DESCRIPTION = "PyBugz is a python and command line interface to Bugzilla. \
 \
It was conceived as a tool to speed up the workflow for Gentoo Linux \
developers and contributors when dealing with bugs using Bugzilla. By \
avoiding the clunky web interface, the user quickly search, isolate and \
contribute to the project very quickly. Developers alike can easily extract \
attachments and close bugs all from the comfort of the command line."
LICENSE = "GPL-2.0-only"

PV = "0.13"

RPM_NAME = "python311-pybugz-0.13-3.10.noarch.rpm"
RPM_HASH = "f1feba7b892140232706a39c6cc34bd643027ca4eda87fea3e7752b974fe52b0384b131f0387cee42a85acdeb136565212a96af0b20b0f75693fd61a40382f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz \
python3-pybugz \
python3.11dist-pybugz \
python311-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
