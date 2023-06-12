SUMMARY = "PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
Commands are available to access the database via the PostgreSQL Server \
Programming Interface (SPI) and to raise messages via elog() . There is no \
way to access internals of the database backend. However the user is able \
to gain OS-level access under the permissions of the PostgreSQL user ID, \
as with a C function. Thus, any unprivileged database user should not be \
permitted to use this language. It must be installed as an untrusted \
procedural language so that only database superusers can create functions \
in it. The writer of a PL/R function must take care that the function cannot \
be used to do anything unwanted, since it will be able to do anything that \
could be done by a user logged in as the database administrator. \
 \
An implementation restriction is that PL/R procedures cannot be used to \
create input/output functions for new data types."
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql14-plr-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "2a027ab0c589daa52ad4a7cfc98ff33c7684a56eb95a0c68943076bf1cd0002be9c8eea2543786ac96b3c1deaf0171e13c74561d276f305df5530a79ee3a1e5e"

RPROVIDES:${PN} += "config(postgresql14-plr) \
postgresql14-plr \
postgresql14-plr(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
postgresql14-server"

inherit rpm
