SUMMARY = "Files needed for NFC development"
DESCRIPTION = "Files needed to test applications for the NFC stack."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-test-0.18-1.4.aarch64.rpm"
RPM_HASH = "6ce3e55ab53d2a51b2e73f79cd85e4444f5bf4d550577f1a5ed7ca207936da19e2c7518fef0ba0fe25b23c7623e6ee0806c63b7e633603accf746d86bc743c7a"

RPROVIDES:${PN} += "neard-test"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/python2.7 \
neard"

inherit rpm
