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

RPM_NAME = "python39-pybugz-0.13-3.9.noarch.rpm"
RPM_HASH = "f2ca6f1001c8ec395bf713a38b63fda1f8852c4cf8db098fd4b73ca4b7f2bcf417e096ec36660b85a027a7b45f7670116493a19025162d5552ea39be08f4d7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybugz \
python39-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
