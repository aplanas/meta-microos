SUMMARY = "TFTP Client class"
DESCRIPTION = "'Net::TFTP' is a class implementing a simple _Trivial File Transfer \
Protocol_ client in Perl as described in RFC1350. 'Net::TFTP' also supports \
the TFTP Option Extension (as described in RFC2347), with the following \
options \
 \
 RFC2348 Blocksize Option"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1901"

RPM_NAME = "perl-Net-TFTP-0.1901-1.25.noarch.rpm"
RPM_HASH = "c6cdfc53bae1ac1b2f406121ca5b5bdb0f8fb89af62af76cad7aa197628c0ad02efceddd336e86c6fe9824c08c278fa09dfa42dcbad2fea05c4464f6c91a2fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--TFTP \
perl-Net--TFTP--IO \
perl-Net-TFTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--MockModule \
perl-Test--More \
perl-Test--Warn"

inherit rpm
