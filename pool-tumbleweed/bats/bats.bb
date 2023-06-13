SUMMARY = "Bash Automated Testing System"
DESCRIPTION = "Bats is a TAP-compliant (http://testanything.org/) testing framework for Bash. \
It provides a simple and repeatable way to verify that the UNIX programs you \
write behave as expected. \
 \
A Bats test file is a Bash script with special syntax for defining test cases. \
Under the hood, each test case is just a function with a description. \
 \
Bats is most useful when testing software written in Bash, but you can use it \
to test any UNIX program."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "bats-1.9.0-1.1.noarch.rpm"
RPM_HASH = "e2ac5057d0a98e0d9922273c0be7c573631561bb9b03e33bfe96f0749d75cfa8882f00869965c189a6d07f5c6d014077ac1d6f7f400d36bf2fa092d06d1ef992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bats"

RDEPENDS:${PN} += "/bin/bash \
gnu_parallel"

inherit rpm
