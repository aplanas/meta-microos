SUMMARY = "Support multimethods and function overloading in Perl"
DESCRIPTION = "The Class:Multimethod module exports a subroutine (&multimethod) that can \
be used to declare other subroutines that are dispatched using a algorithm \
different from the normal Perl subroutine or method dispatch mechanism."
LICENSE = "Artistic-1.0"

PV = "1.701"

RPM_NAME = "perl-Class-Multimethods-1.701-1.21.noarch.rpm"
RPM_HASH = "6137006c34689486e9a68a3e82da47ca5217ec83f4a3353e992586dbe4e5da744e25fa2265a3e64283e949b8cd7e8fb5578f1115f616818afa492fd90648f20f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Multimethods \
perl-Class-Multimethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
