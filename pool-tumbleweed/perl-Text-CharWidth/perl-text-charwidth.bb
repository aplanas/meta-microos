SUMMARY = "Get number of occupied columns of a string on terminal"
DESCRIPTION = "Get number of occupied columns of a string on terminal \
 \
 \
 \
Authors: \
-------- \
    &#20037;&#20445;&#30000; &#26234;&#24195; (Tomohiro KUBOTA) <kubota@debian.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Text-CharWidth-0.04-100.37.aarch64.rpm"
RPM_HASH = "b7a29ddc31829b95efada46ee83917aa51979a78f4623037580373a182700ee346187bc2282805be7ddd26a3b59875e7bb69c4c9b01c02b4b9ad49ee39b92fe9"

RPROVIDES:${PN} += "perl-Text--CharWidth \
perl-Text-CharWidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
