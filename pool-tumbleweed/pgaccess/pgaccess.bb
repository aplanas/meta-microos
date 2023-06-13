SUMMARY = "Database Management Tool for PostgreSQL"
DESCRIPTION = "PgAccess is a graphical interface and application building environment \
for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "0.99.0.20040219"

RPM_NAME = "pgaccess-0.99.0.20040219-19.18.noarch.rpm"
RPM_HASH = "a0410c6388a214c4e36004783f1a22a29d6210df4a0b92300c3510fc67715a1705be8ae1984435077057bcde2ac89c78e5127f52f8fb8c706df15071be4a923f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgaccess"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/tclsh \
PgTcl \
tcllib \
tk"

inherit rpm
