SUMMARY = "represent a series of changes in annotate form"
DESCRIPTION = "Algorithm::Annotate generates a list that is useful for generating output \
simliar to 'cvs annotate'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Algorithm-Annotate-0.10-163.27.noarch.rpm"
RPM_HASH = "dd5f4dfd20f2a9f97aac7ada5297f62cb50d4fc359f866bd0c984df3b00c210cc8f629910e6748c64b97bce21a864651648a6173fd2359af0e809231c8532255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Annotate \
perl-Algorithm-Annotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Algorithm--Diff"

inherit rpm
