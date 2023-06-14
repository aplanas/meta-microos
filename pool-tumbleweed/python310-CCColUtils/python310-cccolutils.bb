SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python310-CCColUtils-1.5-1.13.aarch64.rpm"
RPM_HASH = "8308b38ce91bab7c173f709534ed1769b0e58a4e5598ca78efaaa55be98ffa913d5014ce843cb591441038125f25b54da3fd3d6b8008caa37c9cc43479fda604"

RPROVIDES:${PN} += "python3-CCColUtils \
python3.10dist-cccolutils \
python310-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
