SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python310-bugzillatools-0.5.5-6.14.noarch.rpm"
RPM_HASH = "3d7d52d097f057ed1f5a5fc7573d17c999431fe1fe6ae27437304cd06beeb92d10125abbd4a314361ecf12e0082829087a022c68d9083c3c9e3776eb4b55516a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bugzillatools \
python310-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
