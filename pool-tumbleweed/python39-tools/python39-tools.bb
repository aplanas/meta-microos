SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tools-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "c94ef69b330cff95eada562421643d6d76c87aa5a6230b036c492a18d221834a3f2598467ccad563d9595855e6624dd732f61b9e6d04e80152c7c34a37a9c05a"

RPROVIDES:${PN} += "python39-2to3 \
python39-demo \
python39-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39-base"

inherit rpm
