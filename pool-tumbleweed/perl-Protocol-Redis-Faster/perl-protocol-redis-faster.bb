SUMMARY = "Optimized pure-perl Redis protocol parser/encoder"
DESCRIPTION = "This module implements the Protocol::Redis API with more optimized \
pure-perl internals. See Protocol::Redis for usage documentation. \
 \
This is a low level parsing module, if you are looking to use Redis in \
Perl, try Redis, Redis::hiredis, or Mojo::Redis."
LICENSE = "Artistic-2.0"

PV = "0.003"

RPM_NAME = "perl-Protocol-Redis-Faster-0.003-1.16.noarch.rpm"
RPM_HASH = "d6f9e17341720c0d853f6dcacefef42419d4994eb982c42e7b3e3bec5633e8562154fb7ccb05e927fce016821d0f859b94241e6f7e0fc9696896cbe9b9217800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis--Faster \
perl-Protocol-Redis-Faster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Protocol--Redis \
perl-parent"

inherit rpm
