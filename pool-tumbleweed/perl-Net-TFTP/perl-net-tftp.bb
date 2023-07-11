SUMMARY = "TFTP Client class"
DESCRIPTION = "'Net::TFTP' is a class implementing a simple _Trivial File Transfer \
Protocol_ client in Perl as described in RFC1350. 'Net::TFTP' also supports \
the TFTP Option Extension (as described in RFC2347), with the following \
options \
 \
 RFC2348 Blocksize Option"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1901"

RPM_NAME = "perl-Net-TFTP-0.1901-1.24.noarch.rpm"
RPM_HASH = "8900d69423c4c5260efd9e118ba87ed6d0e45b821f5fb5294b544dcb3fa1f375553ce1b0e872b4e1d0af0e08c417cf3e5c27d7b07160f11a5f760bce41e91027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--TFTP \
perl-Net--TFTP--IO \
perl-Net-TFTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--MockModule \
perl-Test--More \
perl-Test--Warn"

inherit rpm
