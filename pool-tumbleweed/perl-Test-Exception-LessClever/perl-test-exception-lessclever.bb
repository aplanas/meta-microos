SUMMARY = "(DEPRECATED) Test::Exception simplified"
DESCRIPTION = "(DEPRECATED) Test::Exception simplified"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Test-Exception-LessClever-0.009-1.26.noarch.rpm"
RPM_HASH = "ae7553ea9e6e0da05f5c332cd27e0ac3cfa6ab57c0f16e94913eeedd1d2b00e8d5271b67b6f2f68cfa714f4e94a88a04b46600d4c361fce63a6e4aef27b27604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Exception--LessClever \
perl-Test-Exception-LessClever"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
