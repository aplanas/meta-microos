SUMMARY = "Isolated String helpers from B"
DESCRIPTION = "XString provides the B string helpers in one isolated package. Right now \
only cstring and perlstring are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-XString-0.005-1.17.aarch64.rpm"
RPM_HASH = "35412f299478499bf1552d13a00f451322e43d93544574152462de9ce2b6a3960fc0613dcce208633f89f163b0e027715916d0e9cafc4715296053e6fee22329"

RPROVIDES:${PN} += "perl-XString"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
