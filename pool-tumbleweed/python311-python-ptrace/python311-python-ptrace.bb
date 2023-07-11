SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python311-python-ptrace-0.9.7-1.16.aarch64.rpm"
RPM_HASH = "108022ddbba6642c5f39eeae2ac2aa68ef8ea42a159d89a00fb636fe09759ff1071eca28c5a4b98f2db621895b87ecf4209aae4f55414f444cf8125ca3f65098"

RPROVIDES:${PN} += "python3-python-ptrace \
python3.11dist-cptrace \
python3.11dist-python-ptrace \
python311-python-ptrace \
python3dist-cptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
