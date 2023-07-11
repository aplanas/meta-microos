SUMMARY = "Firewalld testsuite"
DESCRIPTION = "This package provides the firewalld testsuite."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-test-2.0.0-1.1.noarch.rpm"
RPM_HASH = "ba54d1d4bc644e699ac3c01ed366cc45768f82740eb736e88f85779c5d1df67a11279248d353f4825ea78ce7894e942592a5aaaffbcac3f409e238cac43fb5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
