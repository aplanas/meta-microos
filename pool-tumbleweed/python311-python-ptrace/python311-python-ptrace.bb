SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python311-python-ptrace-0.9.7-1.14.aarch64.rpm"
RPM_HASH = "8cea4977c02f19166b791a6b5a5a2f79145d4429b1756cd3ed245cfbd849802ea4ac267d5face319ff53ac8a6250b140ffa5a6a4d7a5cc9c38c3b08ca20f5082"

RPROVIDES:${PN} += "python3.11dist-cptrace \
python3.11dist-python-ptrace \
python311-python-ptrace \
python3dist-cptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
