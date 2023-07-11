SUMMARY = "B::COW additional B helpers to check COW status"
DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-B-COW-0.007-1.3.aarch64.rpm"
RPM_HASH = "ae75d7f4e9788e94a365d77c39a11d23d824457937441759a53954a30f5dd199900c9808a6062e30dcee32be3d8dbc3f3b55b76ab556ccdcfe4ff4521fd82337"

RPROVIDES:${PN} += "perl-B--COW \
perl-B-COW"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
