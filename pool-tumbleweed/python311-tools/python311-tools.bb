SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-tools-3.11.5-1.2.aarch64.rpm"
RPM_HASH = "326e2d175a8d8ed21fe24bb12d675fefcb61118164fc47fa55072f85ea1690772e5c6a4353acd6674b4b72af0fe26449ae6d89a70dbd4ea1afa61d8b38fc7894"

RPROVIDES:${PN} += "python3-2to3 \
python3-demo \
python3-tools \
python311-2to3 \
python311-demo \
python311-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311-base"

inherit rpm
