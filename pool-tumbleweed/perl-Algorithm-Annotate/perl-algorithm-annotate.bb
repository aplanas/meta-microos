SUMMARY = "represent a series of changes in annotate form"
DESCRIPTION = "Algorithm::Annotate generates a list that is useful for generating output \
simliar to 'cvs annotate'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Algorithm-Annotate-0.10-163.26.noarch.rpm"
RPM_HASH = "fb721cb24d708bb87915fd401ebcadd013b4f141c5df49b4f67f8546dc6437ff51f5dcec091157ddbe7b35d941ab2a6796910e59472cb142bb36fbecefa1f403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Annotate \
perl-Algorithm-Annotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Algorithm--Diff"

inherit rpm
