SUMMARY = "Tool for Routing Paths"
DESCRIPTION = "This module provides a way of deconstructing paths into parameters suitable \
for dispatching on. It also provides the inverse in that it will take a \
list of parameters, and construct an appropriate uri for it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Path-Router-0.15-1.24.noarch.rpm"
RPM_HASH = "d779a6c74b9e2ab855c60cf1dd2112411cb2a0a830d21004580bedc51e7ff19848fdb74101a7ae6f74985b057c09b000a16a534c7d04868d9ab28a7d98e8d429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--Router \
perl-Path--Router--Route \
perl-Path--Router--Route--Match \
perl-Path--Router--Shell \
perl-Path--Router--Types \
perl-Path-Router \
perl-Test--Path--Router"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
