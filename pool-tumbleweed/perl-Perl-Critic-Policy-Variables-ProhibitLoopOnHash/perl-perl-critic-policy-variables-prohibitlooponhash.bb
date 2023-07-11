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

RPM_NAME = "perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash-0.008-1.16.noarch.rpm"
RPM_HASH = "25718503133d464aa621c9b2cdbe553b590faf57e674731c0b195af7426fb3afc817fa8424f446ae9f6eb15320f912de80e4687f7f86c7fcb8d5040f6cb8ad87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--Variables--ProhibitLoopOnHash \
perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--Util \
perl-Perl--Critic \
perl-parent"

inherit rpm
