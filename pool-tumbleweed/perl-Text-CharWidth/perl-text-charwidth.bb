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

RPM_NAME = "perl-Text-CharWidth-0.04-100.38.aarch64.rpm"
RPM_HASH = "31694e1af85df97d5548817966ce4f2bab0a439843978fc6c6b749d5ac9364138a2e7f4f819aeaafa7b1bf0804caa3247118495ea5f472bd7853e349edf5c042"

RPROVIDES:${PN} += "perl-Text--CharWidth \
perl-Text-CharWidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
