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

RPM_NAME = "schemaspy-5.0.0-7.6.noarch.rpm"
RPM_HASH = "f1b13e38a1821e49b422fc81adf03bb6c8d743712d4cb82d39458d8d3f2bd687f44435e17a67fe46a3e6e7ef8e8c31e5524a10ba013d941c3c5880ec9d83454a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "schemaspy"

RDEPENDS:${PN} += "/bin/bash \
graphviz \
graphviz-gd \
java \
javapackages-tools"

inherit rpm
