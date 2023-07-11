SUMMARY = "A Thin Wrapper around HTTP::Tiny to play nice with HTTP::Message"
DESCRIPTION = "WARNING: This module is untested beyond the very basics. The implementation \
is simple enough that it shouldn't do evil things but, yeah it's still not \
approved for use by small children. \
 \
'HTTP::Thin' is a thin wrapper around the HTTP::Tiny manpage adding the \
ability to pass in the HTTP::Request manpage objects and get back the \
HTTP::Response manpage objects. The maintainers of the HTTP::Tiny manpage, \
justifiably, don't want to have to maintain compatibility but many other \
projects already consume the the HTTP::Message manpage objects. This is \
just glue code doing what it does best."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-HTTP-Thin-0.006-3.27.noarch.rpm"
RPM_HASH = "3a91accae3617eda37bf3c14d2cb241e6918d19ab6f868aff961e4d28dd81846ef072bc8a24dceab7a95c4d81c9cc6bea52fba4bc8b08c6148d4b5285ee00dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Thin \
perl-HTTP-Thin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-HTTP--Response \
perl-HTTP--Tiny \
perl-Hash--MultiValue \
perl-Safe--Isa \
perl-parent"

inherit rpm
