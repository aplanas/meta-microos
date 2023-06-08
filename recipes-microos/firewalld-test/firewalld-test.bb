SUMMARY = "Firewalld testsuite"
DESCRIPTION = "This package provides the firewalld testsuite."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-test-1.3.2-1.1.noarch.rpm"
RPM_HASH = "af913e3a0ea9b0b95a7be79b8308106bfac6566f31e1a78f98036921921f8b83b369d53900ff140b2d64e3f583f18c0de6e7924e6600cc34da0e6f1182deefaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-test"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
