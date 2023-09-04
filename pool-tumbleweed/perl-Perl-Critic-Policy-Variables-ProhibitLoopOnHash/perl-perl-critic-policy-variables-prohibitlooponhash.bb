SUMMARY = "Don't write loops on hashes, only on keys and values of hashes"
DESCRIPTION = "When 'looping over hashes,' we mean looping over hash keys or hash values. \
If you forgot to call 'keys' or 'values' you will accidentally loop over \
both. \
 \
    foreach my $foo (%hash) {...}        # not ok \
    action() for %hash;                  # not ok \
    foreach my $foo ( keys %hash ) {...} # ok \
    action() for values %hash;           # ok \
 \
An effort is made to detect expressions: \
 \
    action() for %hash ? keys %hash : ();                             # ok \
    action() for %{ $hash{'stuff'} } ? keys %{ $hash{'stuff'} } : (); # ok \
 \
(Granted, the second example there doesn't make much sense, but I have \
found a variation of it in real code.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.008"

RPM_NAME = "perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash-0.008-1.17.noarch.rpm"
RPM_HASH = "2dc6619796b7cfb169bd23b4138cb5dc8805942f62ae594e854170fe225a6c68e714fab2a83b3ed61ba73b0d051eed319da04e9086e0378d1103d4d166ab02fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--Variables--ProhibitLoopOnHash \
perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--Util \
perl-Perl--Critic \
perl-parent"

inherit rpm
