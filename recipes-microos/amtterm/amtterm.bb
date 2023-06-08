SUMMARY = "Serial-over-lan (sol) client for Intel AMT"
DESCRIPTION = "AMT (included in Intel vPro and Centrino Pro) provides out-of-band \
(OOB) management for Desktops and Laptops, using an agent integrated in \
the network adapter and in the motherboard. \
 \
Serial-over-lan provides a (secure) way to connect a remote computer, \
through a pseudo serial interface. \
IDE-redirection provides a way to remotely access a virtual drive, which \
can be used eg. for installation or booting. \
 \
This package provide 2 terminals (amtterm and gamt) to connect to that \
pseudo serial interface from a remote computer. amttool is a perl \
script to gather informations about and remotely control AMT managed \
computers. An additional program (amtider) supports IDE-redirection."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "amtterm-1.7-1.7.aarch64.rpm"
RPM_HASH = "490cba78a767f7c58c447996c18d00738905ed7ef59f9e7aa934646c93524d4ee25e1faa7923490a17e4865634046573e0ad5a42a77b1e5e7565efb8779b3ccd"

RPROVIDES:${PN} += "amtterm amtterm(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) perl-SOAP-Lite"

inherit rpm
