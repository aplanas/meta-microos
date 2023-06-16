SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python39-bugzillatools-0.5.5-6.13.noarch.rpm"
RPM_HASH = "07a5fd810e7a6b9a4fbd5f64a562a645911606af0738473d1c31d9b77634461d86ce9bffd485d610bd9e409a22402300bda2839726bf4a6d3d9b52841cbf348c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bugzillatools \
python39-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
