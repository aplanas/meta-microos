SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python39-CCColUtils-1.5-1.13.aarch64.rpm"
RPM_HASH = "a8d0301e4edf91ecfbff47e6a843bdf9d0ce3c3c1c3deda47c4ddd5e27dc4644f85f858fa343e97bc2d1d7bd1071b8d9d398b3e7e96feb58f4a40a4ce3b86a41"

RPROVIDES:${PN} += "python3.9dist-cccolutils \
python39-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
