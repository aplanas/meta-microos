SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python311-scripttest-1.3-8.2.noarch.rpm"
RPM_HASH = "568ecdf7ac93eb708b3a352e3f28918780a2d2e7fd2e2f6bc9cc333e1a88057840de29981d0ed87bfe454990ad5948c9b547fa8c94d9e556d18b04409e26ae1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scripttest \
python3.11dist-scripttest \
python311-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
