SUMMARY = "Provides library and header for boot logging"
DESCRIPTION = "The libaray and the header file for the FIFO interface used to build \
the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "blog-devel-2.26-2.2.aarch64.rpm"
RPM_HASH = "4dbb7063a644519851cec33fb5ac68869d013ca21edea0842c02dbc97c00dccb8d05a285d9c58fcfe27f47e4fe5ca3410af07599f88ebeb9d8af3691b79efd5f"

RPROVIDES:${PN} += "blog-devel blog-devel(aarch-64)"
RDEPENDS:${PN} += "libblogger2"

inherit rpm
