SUMMARY = "Tools for Password Checking and Generation"
DESCRIPTION = "The pwqcheck program checks passphrase quality using the libpasswdqc library. \
The pwqgen program generates a random passphrase using the libpasswdqc library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "9baaac93dc5ef9fb3cc3305ff7adc1b90e09feca3ef9e832244df9512293eb0a066431da49abbca6ec6bc253b1c14e2128856aa5f6afc47e454bbaee813fbbe6"

RPROVIDES:${PN} += "config-passwdqc \
passwdqc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpasswdqc.so.0"

inherit rpm
