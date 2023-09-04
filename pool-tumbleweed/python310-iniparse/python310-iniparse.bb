SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-iniparse-0.5-5.1.noarch.rpm"
RPM_HASH = "803740ff251607c0631a6899a4000302e0492b55bdd58aec6cf05d0bfb4fcd4834c856d8b8ad2ab32ae03e69d4c6c3877cf59bb3abeebe78bcde0118dbb0d0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-iniparse \
python310-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
