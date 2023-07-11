SUMMARY = "Command Line Tool to Process XML Documents"
DESCRIPTION = "XMLStarlet (xml) is a command line XML toolkit which can be used to \
transform, query, validate, and edit XML documents and files using simple \
set of shell commands in similar way it is done for plain text files using \
'grep', 'sed', 'awk', 'tr', 'diff', or 'patch'."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "xmlstarlet-1.6.1-2.1.aarch64.rpm"
RPM_HASH = "e58c03874d839c274815bc5e8cd6e53d615bad1eade51f06acd4eaf2b824490a750742ad69113663fb7017e616b37532caff09e1e48ead401930115f1f051cfd"

RPROVIDES:${PN} += "xmlstarlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
