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

PV = "1.10.0"

RPM_NAME = "bats-1.10.0-1.1.noarch.rpm"
RPM_HASH = "9f16613d4007fcf2670c4cf8cb0963c0ef2004ca17716da3520d4f72b175736d4d04ce5844e5edec9ebfeccc1cda82c332d3816944a497f8bc475726b981f89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bats"

RDEPENDS:${PN} += "/usr/bin/bash \
gnu-parallel"

inherit rpm
