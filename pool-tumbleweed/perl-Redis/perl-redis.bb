SUMMARY = "Perl binding for Redis database"
DESCRIPTION = "Pure perl bindings for https://redis.io/ \
 \
This version supports protocol 2.x (multi-bulk) or later of Redis available \
at https://github.com/antirez/redis/. \
 \
This documentation lists commands which are exercised in test suite, but \
additional commands will work correctly since protocol specifies enough \
information to support almost all commands with same piece of code with a \
little help of 'AUTOLOAD'."
LICENSE = "Artistic-2.0"

PV = "2.000"

RPM_NAME = "perl-Redis-2.000-1.3.noarch.rpm"
RPM_HASH = "7662ccb8c90095330519d1c08c7b5b253cd2b860e2081bab535193f8588308177ebed937ac14e550aea11066115d443fb2fcb21308f920fcf26316ad6a39e531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Redis \
perl-Redis--Hash \
perl-Redis--List \
perl-Redis--Sentinel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--Timeout \
perl-Try--Tiny"

inherit rpm
