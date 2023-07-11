SUMMARY = "The Heimdal implementation of the Kerberos 5 protocol"
DESCRIPTION = "Heimdal is an implementation of Kerberos 5 (and some more stuff) largely written \
in Sweden (which was important when we started writing it, less so now). \
It is freely available under a three clause BSD style license. \
 \
Other free implementations include the one from MIT, and Shishi. \
Also Microsoft Windows and Sun's Java come with implementations of Kerberos. \
 \
This package only provides libraries and devel files (binaries have been removed), \
libraries are required by 64-bit package of ICAClient version 13.2."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimdal-devel-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "9b0059b96664588451d620001b3771ca83de0c1cd35a3ccf76918754e1deaf43b14fb728b304159a254560b63ec58da0b532dace97ad4157ef7496a2f90268a4"

RPROVIDES:${PN} += "libheimdal \
libheimdal-devel"

RDEPENDS:${PN} += "db-devel \
glibc-devel \
libasn1-8 \
libgssapi3 \
libhcrypto4 \
libhdb9 \
libheimbase1 \
libheimedit0 \
libheimntlm0 \
libhx509-5 \
libkadm5clnt7 \
libkadm5srv8 \
libkafs0 \
libkdc2 \
libkrb5-26 \
libotp0 \
libroken18 \
libsl0 \
libwind0 \
pkgconfig-com-err \
pkgconfig-ncurses \
pkgconfig-sqlite3"

inherit rpm
