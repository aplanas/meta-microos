SUMMARY = "Development files for the SMPP-3.4 protocol library"
DESCRIPTION = "The library provides the PDU handling of the SMPP-3.4 protocol. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmpp34."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libsmpp34-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "79aaa730169db70578bc08fc956ba568ab51f4b4f86e7450c9fe072f637878feacad06c8ea5229b2497bcdfb56baf7fe0a96a640362900ea889a0ae4751f60ff"

RPROVIDES:${PN} += "libsmpp34-0-devel \
libsmpp34-devel \
pkgconfig-libsmpp34"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmpp34-1"

inherit rpm
