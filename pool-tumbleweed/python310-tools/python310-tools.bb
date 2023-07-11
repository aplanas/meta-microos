SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tools-3.10.12-1.2.aarch64.rpm"
RPM_HASH = "e8968aa1dabc28604ea2c2f6c7f843de40fe337f1233b4f2709d5495201d593d165dbbe9396dad34227ca7eae5b50779c81b4ea93feb1b540404b1eff94219f1"

RPROVIDES:${PN} += "python310-2to3 \
python310-demo \
python310-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310-base"

inherit rpm
