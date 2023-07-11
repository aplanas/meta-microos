SUMMARY = "Tool for analyzing and graphing database schemas"
DESCRIPTION = "SchemaSpy is a Java-based tool that analyzes the metadata of a \
schema in a database and generates a visual representation of it in a \
browser-displayable format. It lets you click through the hierarchy of \
database tables via child and parent table relationships as represented \
by both HTML links and entity-relationship diagrams. It's also designed \
to help resolve the obtuse errors that a database sometimes gives related \
to failures due to constraints. \
 \
SchemaSpy uses JDBC's database metadata extraction services to gather the \
majority of its information, but has to make vendor-specific SQL queries \
to gather some information such as the SQL associated with a view and \
the details of check constraints. The differences between vendors have \
been isolated to configuration files and are extremely limited. Almost \
all of the vendor-specific SQL is optional."
LICENSE = "LGPL-2.1-only"

PV = "5.0.0"

RPM_NAME = "schemaspy-5.0.0-7.7.noarch.rpm"
RPM_HASH = "db3c0cb0b3b0bdfb00f601806cb83b8050597fdc24672cdad2779fa21735d28dff003fc7d07fb2e44b57ac1e1fac0adc14fb72e8a852c4226d1127a30da21586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "schemaspy"

RDEPENDS:${PN} += "/usr/bin/bash \
graphviz \
graphviz-gd \
java \
javapackages-tools"

inherit rpm
