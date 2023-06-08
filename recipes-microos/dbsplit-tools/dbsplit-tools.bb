SUMMARY = "DocBook Splitting tools"
DESCRIPTION = "Tools for splitting and merging DocBook documents,"
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "dbsplit-tools-0.6-141.9.noarch.rpm"
RPM_HASH = "2cfa51b1ca9f0f485adacfaa38997b931db68e01a63e8b871840ff43d06b903920db5c6a0f118aed9eee50141a6330223ec3b84d08ba2594de2e407dee9f0713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbsplit-tools"
RDEPENDS:${PN} += "/usr/bin/perl perl-XML-DOM perl-XML-RegExp"

inherit rpm
