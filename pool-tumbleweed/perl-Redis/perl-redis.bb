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

RPM_NAME = "perl-Redis-2.000-1.2.noarch.rpm"
RPM_HASH = "057efdbdbfa507f96e46b707113a7a246d1aa293cb8a3a7f3c4a2d50e829f5661356e11ba9ad73364519d878c3eb9c6957b9f7f6ca5cef0b68eed08724e1cd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Redis \
perl-Redis--Hash \
perl-Redis--List \
perl-Redis--Sentinel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--Timeout \
perl-Try--Tiny"

inherit rpm
