SUMMARY = "Tool for Routing Paths"
DESCRIPTION = "This module provides a way of deconstructing paths into parameters suitable \
for dispatching on. It also provides the inverse in that it will take a \
list of parameters, and construct an appropriate uri for it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Path-Router-0.15-1.25.noarch.rpm"
RPM_HASH = "aabe94277960a6ddf52d583e11a58a57d534019f036008326f16297dd64e59090c3f96b8a50ea302af83f9f2c95c5ef04e0a6688a2fb6c3ef6460f766599650f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--Router \
perl-Path--Router--Route \
perl-Path--Router--Route--Match \
perl-Path--Router--Shell \
perl-Path--Router--Types \
perl-Path-Router \
perl-Test--Path--Router"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-Clone--PP \
perl-Data--Dumper \
perl-Eval--Closure \
perl-File--Spec--Unix \
perl-Moo \
perl-Sub--Exporter \
perl-Term--ReadLine \
perl-Test--Builder \
perl-Test--Deep \
perl-Try--Tiny \
perl-Type--Tiny \
perl-Types--Standard \
perl-constant \
perl-namespace--clean"

inherit rpm
