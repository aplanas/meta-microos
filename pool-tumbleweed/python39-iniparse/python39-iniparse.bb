SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-iniparse-0.5-4.5.noarch.rpm"
RPM_HASH = "87c17db16ec4d73e0e1e2b7da374fd7f14a2a97a6e935a1794e005bf4b525020036050f62f4a93c3396186213328ace030710387b5eb67bd61a9c1b53d012586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iniparse \
python39-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
