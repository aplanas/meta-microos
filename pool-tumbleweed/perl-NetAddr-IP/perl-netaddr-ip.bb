SUMMARY = "Manages IPv4 and IPv6 addresses and subnets"
DESCRIPTION = "This module provides an object-oriented abstraction on top of IP addresses \
or IP subnets that allows for easy manipulations. Version 4.xx of \
NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt. \
 \
The internal representation of all IP objects is in 128 bit IPv6 notation. \
IPv4 and IPv6 objects may be freely mixed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.079"

RPM_NAME = "perl-NetAddr-IP-4.079-1.34.aarch64.rpm"
RPM_HASH = "81e2acead0a023d5abff91d1112dc047b7153e48c7bf12c13cf236f7caee703ce68b95c4773d190ed252d3c00496c059ed41886e6b30d164988dfebe4247b404"

RPROVIDES:${PN} += "perl-NetAddr--IP \
perl-NetAddr--IP--InetBase \
perl-NetAddr--IP--Lite \
perl-NetAddr--IP--Util \
perl-NetAddr--IP--Util-IS \
perl-NetAddr--IP--UtilPP \
perl-NetAddr--IP--UtilPolluted \
perl-NetAddr-IP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
