SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python311-bugzillatools-0.5.5-6.13.noarch.rpm"
RPM_HASH = "b1639331cc97272715d86099625ec1fd0e5cb58e99b130ebaabdcb11853763dda74cc626537b36ceefcba69355afd4d5a0e9aa2115579817c484d2c85502d7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bugzillatools) \
python311-bugzillatools \
python3dist(bugzillatools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
