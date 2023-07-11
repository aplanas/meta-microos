SUMMARY = "A free re-implementation of the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. \
 \
This subpackage contains default configuration files and documentation for \
them."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "freetds-config-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "3d611db98c93b1839b4cb84ba97b3a4bb1b125e220adb524f286ceb1531af1f13b12a562931ad0d29e7b6abdc01aa736c9fb5868405b5e967f794ff642d51d52"

RPROVIDES:${PN} += "config-freetds-config \
freetds \
freetds-config \
libfreetds"

RDEPENDS:${PN} += ""

inherit rpm
