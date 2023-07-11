SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python39-net-snmp-5.9.3-4.10.aarch64.rpm"
RPM_HASH = "dc70c2c6da3f23484c2f610140dd65d72951ff2e488c383b443e192298a786a85874263f3eef564558faeb8fab697942b01e161782bd5e1fe0afdafc0ad1c35d"

RPROVIDES:${PN} += "python3.9dist-netsnmp-python \
python39-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsnmp40 \
python-abi"

inherit rpm
