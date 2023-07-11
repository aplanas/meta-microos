SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python311-CCColUtils-1.5-1.15.aarch64.rpm"
RPM_HASH = "c63b611feb77e0b8affe59ff2b45b3583ea51c4339907998e94aff71b72a328f6d6280e88230e42bc805b0795606fa533afd9216d36f1e9d56d544a6d173be0a"

RPROVIDES:${PN} += "python3-CCColUtils \
python3.11dist-cccolutils \
python311-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
