SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python310-python-ptrace-0.9.7-1.16.aarch64.rpm"
RPM_HASH = "d3c60213cceb40d9e2fd9c86f03a9a2f1e54be4e6b62cd94dcca7316465a29eae1f9b57324d17ff1a156d8952678fc7b058d81a5f08d1d3a66dd0a16b85c80cb"

RPROVIDES:${PN} += "python3.10dist-cptrace \
python3.10dist-python-ptrace \
python310-python-ptrace \
python3dist-cptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
