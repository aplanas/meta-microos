SUMMARY = "A printer application framework"
DESCRIPTION = "PAPPL is a C-based framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. PAPPL supports LPrint and a Gutenprint Printer Application, \
but it is sufficiently general purpose to support any kind of printer \
or driver that can be used on desktops, servers and in embedded \
environments. \
 \
PAPPL supports JPEG, PNG, PWG Raster, Apple Raster, and 'raw' \
printing to printers connected via USB and network \
(AppSocket/JetDirect) connections. PAPPL provides access to the \
printer via its embedded IPP Everywhere service, either local to the \
computer or on your whole network, which can then be discovered and \
used by any application."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "pappl-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "9475c2e57e758add85f8e10c13d5c253532c4416eb254c2b4dd312094a1d492cd65b843d27ed5c1743f06f0046479a8785ce3da953c2da33a1e7da342790b15c"

RPROVIDES:${PN} += "pappl"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
