SUMMARY = "Simple sets of strings"
DESCRIPTION = "Set::Tiny is a thin wrapper around regular Perl hashes to perform often \
needed set operations, such as testing two sets of strings for equality, or \
checking whether one is contained within the other. \
 \
For a more complete implementation of mathematical set theory, see \
Set::Scalar. For sets of arbitrary objects, see Set::Object."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Set-Tiny-0.04-1.13.noarch.rpm"
RPM_HASH = "4a7a07eded94dde9c5c3158fcff176b2116762e3507d12b337fd37bcdb56a8536888d85f8c300b80cf11f9591ba28e7804c386660b0806ce6c0e01fa894c2daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--Tiny \
perl-Set-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
