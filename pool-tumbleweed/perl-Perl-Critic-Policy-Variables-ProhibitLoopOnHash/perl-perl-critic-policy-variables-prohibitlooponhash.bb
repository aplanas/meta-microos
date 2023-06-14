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

RPM_NAME = "perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash-0.008-1.15.noarch.rpm"
RPM_HASH = "3016330524b4c8310d9fdb2baf04099e2b7ee351d4526f0eec1a068c97c6122fd02bd87b362052e19e59804fe6498850645d3b584167c6d1702b6f32a5cf19dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--Variables--ProhibitLoopOnHash \
perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-List--Util \
perl-Perl--Critic \
perl-parent"

inherit rpm
