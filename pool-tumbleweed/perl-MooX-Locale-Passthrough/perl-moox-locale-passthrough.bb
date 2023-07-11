SUMMARY = "Provide API used in translator modules without translating"
DESCRIPTION = "'MooX::Locale::Passthrough' is made to allow CPAN modules use translator \
API without adding heavy dependencies (external software) or requirements \
(operating resulting solution). \
 \
This software is released together with MooX::Locale::TextDomain::OO, which \
allowes then to plugin any desired translation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001"

RPM_NAME = "perl-MooX-Locale-Passthrough-0.001-1.13.noarch.rpm"
RPM_HASH = "5ecb7071bbd12386dfc0849d4c6311f4b3e656992b43421d2e72bfd1ea52fd69f8a0ce5346c5e17158bad6a030b97b362bd4a70611d8cfe07b558ba4d6942767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Locale--Passthrough \
perl-MooX-Locale-Passthrough"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moo"

inherit rpm
