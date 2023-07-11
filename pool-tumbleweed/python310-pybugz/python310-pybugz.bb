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

RPM_NAME = "python310-pybugz-0.13-3.10.noarch.rpm"
RPM_HASH = "fd77884b14a5d8e1386f81b23c1c0f46a083ec5d71fe51b4735b77c2588c0d7ec0cb8770afeee0c624c01cebf5647da0d9b9d42ce5a9c0fe24d0c537ad7e78ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybugz \
python310-pybugz \
python3dist-pybugz"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
