SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python39-CCColUtils-1.5-1.15.aarch64.rpm"
RPM_HASH = "7078d107bdac6c3fc663555f316977e44c6c204d155c0feee96deb82903f76f8e2f2701b033ae10e7b31eb67e94ca28a7edae2758052c53e1d68f638983193e2"

RPROVIDES:${PN} += "python3.9dist-cccolutils \
python39-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
