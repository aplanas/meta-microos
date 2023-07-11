SUMMARY = "SQL support for saxon8"
DESCRIPTION = "Supports XSLT extensions for accessing and updating a relational \
database from within a stylesheet."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-sql-B.8.8-133.7.noarch.rpm"
RPM_HASH = "ca6214ed3c1dffeecbc7f30ae1a14fdb0e82345848da1334e9a46f00f1c804eee3969e7eafc46ff63b8341d47614ee2ff31bfca481e3818aed300de7d89637c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-sql"

RDEPENDS:${PN} += "saxon8"

inherit rpm
