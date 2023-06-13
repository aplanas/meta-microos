SUMMARY = "Optimized pure-perl Redis protocol parser/encoder"
DESCRIPTION = "This module implements the Protocol::Redis API with more optimized \
pure-perl internals. See Protocol::Redis for usage documentation. \
 \
This is a low level parsing module, if you are looking to use Redis in \
Perl, try Redis, Redis::hiredis, or Mojo::Redis."
LICENSE = "Artistic-2.0"

PV = "0.003"

RPM_NAME = "perl-Protocol-Redis-Faster-0.003-1.15.noarch.rpm"
RPM_HASH = "914b9f426156f008454a9f65b8a104bec4fafaf0714cb2fdc95b87694b85c02652617eda1cacb5ee8e2629bcd8f691ee31514036d05047ff2ce4ffd149917b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Protocol::Redis::Faster) \
perl-Protocol-Redis-Faster"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Protocol::Redis) \
perl(parent)"

inherit rpm
