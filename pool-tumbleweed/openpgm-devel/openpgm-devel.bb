SUMMARY = "Development files for the OpenPGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss. \
 \
This subpackage contains the header files for OpenPGM."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.128"

RPM_NAME = "openpgm-devel-5.3.128-2.1.aarch64.rpm"
RPM_HASH = "c9cce9c6f6583e977fbc11f545d6eb376fb30b1dbe948b29fc50403d40f38174e0acf1c474df6732b305866bb8388d9791fa50ec2834c60844ca63a439c35222"

RPROVIDES:${PN} += "openpgm-devel \
pkgconfig-openpgm-5.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpgm-5-3-0"

inherit rpm
