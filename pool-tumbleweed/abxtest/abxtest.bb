SUMMARY = "Double-blind ABX comparison testing script"
DESCRIPTION = "abxtest is a tool for conducting listening (or other subjective) tests to \
determine whether a listener can discern a difference between two subjects \
under test, denoted A and B."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "abxtest-0.15.2b-2.15.aarch64.rpm"
RPM_HASH = "1af2bd35c3c752f551b6bdd29b57c14eb1182f0293f1e7c91bd80db5cc1d077654d33f91e7ae1e282cb26702f49c016921aa44faaeb4fc05236b1154c8ba7314"

RPROVIDES:${PN} += "abxtest"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
