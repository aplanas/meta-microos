SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-iniparse-0.5-4.5.noarch.rpm"
RPM_HASH = "6801087e30eacfa607494d044bc8d54ae7efab6cf7f0291dc9c722bac8161bbbfcb2d5466f76d6bd643b4785f76a8592d2563542e83b1f93babb6be37b677bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-iniparse \
python310-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
