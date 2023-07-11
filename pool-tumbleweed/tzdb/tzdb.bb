SUMMARY = "Time zone rules compiler Java"
DESCRIPTION = "This is a time zone rules compiler for opensource Java Virtual Machine \
derived from openjdk8 source code."
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "1.8"

RPM_NAME = "tzdb-1.8-3.20.noarch.rpm"
RPM_HASH = "89aa883e71ca12c5de7eb352855c89706efc392051e32b7554790679c96f6189fb2ac4387453c44da8524b5408f9b0f106ec48de9a2fec76ebb038d366a275ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tzdb"

RDEPENDS:${PN} += ""

inherit rpm
