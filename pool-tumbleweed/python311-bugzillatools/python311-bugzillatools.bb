SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python311-bugzillatools-0.5.5-6.14.noarch.rpm"
RPM_HASH = "3814fb7b863d40d9f6e9bef8cf58fdfb40bdc954135030aee9b26a2d1987a1e9efcd0077b2d1fd980c9d6972d213946fb5a8e1d221b5911f218578f2f27f0ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzillatools \
python3.11dist-bugzillatools \
python311-bugzillatools \
python3dist-bugzillatools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
