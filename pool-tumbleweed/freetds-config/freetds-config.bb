SUMMARY = "A free re-implementation of the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. \
 \
This subpackage contains default configuration files and documentation for \
them."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "freetds-config-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "4c3af9a23728d580ef407cfc74e243716cbca11772385fae5e50a4dba45008012cd9d50f2342c9f10b9c8b66c0486d1d1e7e6dca3a57926bc06c4f70d1acdc66"

RPROVIDES:${PN} += "config-freetds-config \
freetds \
freetds-config \
libfreetds"

RDEPENDS:${PN} += ""

inherit rpm
