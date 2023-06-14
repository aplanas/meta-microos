SUMMARY = "Replacement for Make"
DESCRIPTION = "SCons is a make replacement that provides a range of enhanced features, \
such as automated dependency generation and built-in compilation cache \
support. SCons rule sets are Python scripts, which means that SCons \
provides itself as well as the features. SCons allows you to use the \
full power of Python to control compilation."
LICENSE = "MIT"

PV = "4.5.2"

RPM_NAME = "scons-4.5.2-1.1.noarch.rpm"
RPM_HASH = "0c2beaca90ef325dca89ff622291b1d6744b6dc80567a3512b67fc55e5e95c7bc5d31e9347aefae225ae9449c12c6cd5f06ab5d658730532c60418ab208a22c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scons \
python3dist-scons \
scons"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
