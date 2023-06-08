SUMMARY = "Test scripts for Booth"
DESCRIPTION = "This package contains automated tests for Booth, \
the Cluster Ticket Manager for Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+20220815.f40c2d5"

RPM_NAME = "booth-test-1.0+20220815.f40c2d5-1.3.aarch64.rpm"
RPM_HASH = "2aff573566128e5de29af89c5717b5382f5c94f9aa036d5130fa2b4b6bf83c5197fe7631bf9da766f42ece5b815c8d1697fdc97ddf1482eca08b7dd3367b57b8"

RPROVIDES:${PN} += "booth-test booth-test(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh booth python3"

inherit rpm
