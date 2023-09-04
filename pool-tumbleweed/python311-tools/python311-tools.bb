SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-tools-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "be22c00eabdec682ebfe7515021453e7472218527be22c300e3c3ca3d7330d4431592d20a196f4c8b156769fc370f3629d6499ecbff03b05e40bb66c430833fe"

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
