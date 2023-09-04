SUMMARY = "Optimized pure-perl Redis protocol parser/encoder"
DESCRIPTION = "This module implements the Protocol::Redis API with more optimized \
pure-perl internals. See Protocol::Redis for usage documentation. \
 \
This is a low level parsing module, if you are looking to use Redis in \
Perl, try Redis, Redis::hiredis, or Mojo::Redis."
LICENSE = "Artistic-2.0"

PV = "0.003"

RPM_NAME = "perl-Protocol-Redis-Faster-0.003-1.17.noarch.rpm"
RPM_HASH = "6be3b0dff8ede18a0fd39ffbb70df3c9a581af81d259f6dd862fceed1b33e8591a7593ad695e2b61a62a08c3d10a72f5af183b42d0ec7838c2d01e1575a6e694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis--Faster \
perl-Protocol-Redis-Faster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Protocol--Redis \
perl-parent"

inherit rpm
