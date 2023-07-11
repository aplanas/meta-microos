SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python39-python-ptrace-0.9.7-1.16.aarch64.rpm"
RPM_HASH = "8af3fe1fa7d69c7a44afe72ceef43203c5c657cc9cacde7ea540708c379ba4b29c985e845531cc90415589b0e7fe1729c63aa204b66029be8e3d0369a465056b"

RPROVIDES:${PN} += "python3.9dist-cptrace \
python3.9dist-python-ptrace \
python39-python-ptrace \
python3dist-cptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
