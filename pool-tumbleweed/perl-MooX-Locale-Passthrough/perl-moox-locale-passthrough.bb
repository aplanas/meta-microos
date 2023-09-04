SUMMARY = "Provide API used in translator modules without translating"
DESCRIPTION = "'MooX::Locale::Passthrough' is made to allow CPAN modules use translator \
API without adding heavy dependencies (external software) or requirements \
(operating resulting solution). \
 \
This software is released together with MooX::Locale::TextDomain::OO, which \
allowes then to plugin any desired translation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001"

RPM_NAME = "perl-MooX-Locale-Passthrough-0.001-1.14.noarch.rpm"
RPM_HASH = "b47ae0a469e94643973e554c9574f6d092fe659760932e0b89816597cbf497e4e5d8056d09282d99de30c51361012aa76fb950c9e8487ade18a866c275dbac2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Locale--Passthrough \
perl-MooX-Locale-Passthrough"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo"

inherit rpm
