SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-tools-3.11.3-1.2.aarch64.rpm"
RPM_HASH = "10cca70e01b199ef0011f329bf79a4bd41b8c94176b2a77706615e47b3c530c8a7eb575dbe7f18c98c21c450f0c6963b3e27fc61a93fae84883fb844528ee73c"

RPROVIDES:${PN} += "python311-2to3 \
python311-demo \
python311-tools \
python311-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python(abi) \
python311-base"

inherit rpm
