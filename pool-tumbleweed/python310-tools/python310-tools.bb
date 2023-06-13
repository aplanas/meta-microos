SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-tools-3.10.11-1.2.aarch64.rpm"
RPM_HASH = "256e5d2f19b383dd3fed5bbd43dd492d3208ede5b5820d525b8bbe47a2d3581a233ab8acaff098d69cb217aa1b7fb1575aa58ad19b46141166dc0540bc7232ad"

RPROVIDES:${PN} += "python3-2to3 \
python3-demo \
python3-tools \
python310-2to3 \
python310-demo \
python310-tools \
python310-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.10 \
python(abi) \
python310-base"

inherit rpm
