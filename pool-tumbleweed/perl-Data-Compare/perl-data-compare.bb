SUMMARY = "Compare perl data structures"
DESCRIPTION = "Compare two perl data structures recursively. Returns 0 if the structures \
differ, else returns 1. \
 \
A few data types are treated as special cases: \
 \
* Scalar::Properties objects \
 \
This has been moved into a plugin, although functionality remains the same \
as with the previous version. Full documentation is in \
Data::Compare::Plugins::Scalar::Properties. \
 \
* Compiled regular expressions, eg qr/foo/ \
 \
These are stringified before comparison, so the following will match: \
 \
    $r = qr/abc/i; \
    $s = qr/abc/i; \
    Compare($r, $s); \
 \
and the following won't, despite them matching *exactly* the same text: \
 \
    $r = qr/abc/i; \
    $s = qr/[aA][bB][cC]/; \
    Compare($r, $s); \
 \
Sorry, that's the best we can do. \
 \
* CODE and GLOB references \
 \
These are assumed not to match unless the references are identical - ie, \
both are references to the same thing. \
 \
You may also customise how we compare structures by supplying options in a \
hashref as a third parameter to the 'Compare()' function. This is not yet \
available through the OO-ish interface. These options will be in force for \
the *whole* of your comparison, so will apply to structures that are \
lurking deep down in your data as well as at the top level, so beware! \
 \
* ignore_hash_keys \
 \
an arrayref of strings. When comparing two hashes, any keys mentioned in \
this list will be ignored."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Data-Compare-1.29-1.1.noarch.rpm"
RPM_HASH = "7a3b191e1657a6ab270907d7befee568e5a6748587802df41aa2a4408879f17afd84651022e43eb88bf39d118f2a2394183fc48d76315b28270c2e1d2ad9419d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Compare \
perl-Data--Compare--Plugins--Scalar--Properties \
perl-Data-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Clone \
perl-File--Find--Rule \
perl-Test--More"

inherit rpm
