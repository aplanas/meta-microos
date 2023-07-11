SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python39-bugzillatools-0.5.5-6.14.noarch.rpm"
RPM_HASH = "7bf36a8b3ae17caf19924d484b244fba55b9e4cc1a4af797e77f7b51d17dcb707ea21987ef919f005cc865366535b811823d54e9d65b402526ffb62dfdc1ac8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bugzillatools \
python39-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
