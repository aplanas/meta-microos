SUMMARY = "Fast and correct UTF-8 IO"
DESCRIPTION = "This module provides a fast and correct UTF-8 PerlIO layer. Unlike perl's \
default ':utf8' layer it checks the input for correctness."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-PerlIO-utf8_strict-0.010-1.5.aarch64.rpm"
RPM_HASH = "a9839a6f9eab573c705a449c4631e49ad6df9dad23fa5b6a3fb87a7335f36f6a77101923f2d45f58deb260bd777675eb70ce7027adeb498ee3becc30ee667aac"

RPROVIDES:${PN} += "perl-PerlIO--utf8-strict \
perl-PerlIO-utf8-strict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
