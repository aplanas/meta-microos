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

RPM_NAME = "perl-NetAddr-IP-4.079-1.35.aarch64.rpm"
RPM_HASH = "c1ab4193961dd75df2ba573b798143a7b2c83d1dea22ca17a465f7048a4bd25136034794644b672285f711c846f08776828f9b80bd685a126ced67a8630bae95"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
