SUMMARY = "Easily timeout long running operations"
DESCRIPTION = "'Time::Out' provides an easy interface to _alarm(2)_ based timeouts. Nested \
timeouts are supported."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Time-Out-0.11-3.27.noarch.rpm"
RPM_HASH = "5185aab94d70bee1a9463e106fb2b0891b5c908080817527940ed7962d9e6fc575689f3ab741b9aa5abd8fe6b35f303c5b9bf2188a0c760483e15d4b63c646ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Out \
perl-Time-Out"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
