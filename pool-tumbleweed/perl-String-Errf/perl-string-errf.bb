SUMMARY = "Simple sprintf-like dialect"
DESCRIPTION = "String::Errf provides 'errf', a simple string formatter that works \
something like 'sprintf'. It is implemented using String::Formatter and \
Sub::Exporter. Their documentation may be useful in understanding or \
extending String::Errf. The 'errf' subroutine is only available when \
imported. Calling String::Errf::errf will not do what you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-Errf-0.009-1.3.noarch.rpm"
RPM_HASH = "fcd10bc0dc68d9724b46f6617b76fc7fb8a7f7a95c05283a62dba06114aae606c4a2df0e30654f726db32f2e3e5c2aa3e7a85ae45d2f889b556a4848a4ec8520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Errf \
perl-String-Errf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Util \
perl-String--Formatter \
perl-Sub--Exporter \
perl-Time--Piece \
perl-parent"

inherit rpm
