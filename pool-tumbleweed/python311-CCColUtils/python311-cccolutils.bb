SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python311-CCColUtils-1.5-1.13.aarch64.rpm"
RPM_HASH = "33dc6cfb0874cb0d6b578fe6e4b1d75d1d6294f3a792c2a903acd89cd72242b582e36fe336668567805da4077ad3ec36c5a996f04f36d8fa8c0e0639ab49bd9a"

RPROVIDES:${PN} += "python3.11dist(cccolutils) \
python311-CCColUtils \
python311-CCColUtils(aarch-64) \
python3dist(cccolutils)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
python(abi)"

inherit rpm
