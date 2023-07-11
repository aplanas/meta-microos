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

RPM_NAME = "python39-pybugz-0.13-3.10.noarch.rpm"
RPM_HASH = "91dfbdb8af3b36a1dec84a9373cd0e595e22885155caac10fd649c332de7bbc222cfbb3711c5ec48584b0c3c53da1f81b9fa24f38ba2e8de855489bf804b2937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybugz \
python39-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
