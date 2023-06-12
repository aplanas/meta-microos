SUMMARY = "Firewalld testsuite"
DESCRIPTION = "This package provides the firewalld testsuite."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-test-1.3.2-2.1.noarch.rpm"
RPM_HASH = "6b9bf8b0d557e4003f928b398c5a01654ba3a8fbfd11906c8cb43906c1c95166dc8d2034f064f85f7684ba133729529bfc31f04485b098f735e1b0bb8082673d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-test"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
