SUMMARY = "Firewalld testsuite"
DESCRIPTION = "This package provides the firewalld testsuite."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-test-2.0.0-2.1.noarch.rpm"
RPM_HASH = "9acde88dd5790fe1aa19237dafbb385d057c0b2bd51c871c8e2f33389fa6b673856ca7cdea427f8360a915da1605099b59013c6f5dd6518c44d03e943ad98af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
