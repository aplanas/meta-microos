SUMMARY = "Perl module for the X Window System Protocol, version 11"
DESCRIPTION = "X11::Protocol is a client-side interface to the X11 Protocol (see X(1) for \
information about X11), allowing perl programs to display windows and \
graphics on X11 servers. \
 \
A full description of the protocol is beyond the scope of this \
documentation; for complete information, see the _X Window System Protocol, \
X Version 11_, available as Postscript or *roff source from \
'ftp://ftp.x.org', or _Volume 0: X Protocol Reference Manual_ of O'Reilly & \
Associates's series of books about X (ISBN 1-56592-083-X, \
'http://www.oreilly.com'), which contains most of the same information."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.56"

RPM_NAME = "perl-X11-Protocol-0.56-15.16.noarch.rpm"
RPM_HASH = "6307e17db4b7e5d82fdc2104a5451a6f7ec15ce795086066952641b8f67b62008b50d3e0bcde634f82c2a7feb9b5bef3fd45b1c118a6e2388f07b961ce35a7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-X11--Auth \
perl-X11--Keysyms \
perl-X11--Protocol \
perl-X11--Protocol--Connection \
perl-X11--Protocol--Connection--FileHandle \
perl-X11--Protocol--Connection--INETFH \
perl-X11--Protocol--Connection--INETSocket \
perl-X11--Protocol--Connection--Socket \
perl-X11--Protocol--Connection--UNIXFH \
perl-X11--Protocol--Connection--UNIXSocket \
perl-X11--Protocol--Constants \
perl-X11--Protocol--Ext--BIG-REQUESTS \
perl-X11--Protocol--Ext--DPMS \
perl-X11--Protocol--Ext--RENDER \
perl-X11--Protocol--Ext--SHAPE \
perl-X11--Protocol--Ext--XC-MISC \
perl-X11--Protocol--Ext--XFree86-Misc \
perl-X11-Protocol"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
