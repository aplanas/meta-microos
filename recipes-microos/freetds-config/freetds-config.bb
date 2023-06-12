SUMMARY = "A free re-implementation of the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. \
 \
This subpackage contains default configuration files and documentation for \
them."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "freetds-config-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "cfec3f7285ae72d3356013369e12bff789391480cf7c6025e608aa2a25de3e264650e121754b0692bdc045e12b475810325d37cc854c36913ad1f4a8799b7861"

RPROVIDES:${PN} += "config(freetds-config) \
freetds \
freetds-config \
freetds-config(aarch-64) \
libfreetds"
RDEPENDS:${PN} += ""

inherit rpm
