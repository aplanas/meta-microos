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

RPM_NAME = "perl-Redis-2.000-1.1.noarch.rpm"
RPM_HASH = "1e6bef2e7f239ad1429cc55c9446d89aa84013ff477398d26f2042b492bf01f5b02452f5879ebae73f7ac331d34df485b9832acb01f9f2ca3e8efb9d40b38f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Redis) \
perl(Redis::Hash) \
perl(Redis::List) \
perl(Redis::Sentinel) \
perl-Redis"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::Socket::Timeout) \
perl(Try::Tiny)"

inherit rpm
