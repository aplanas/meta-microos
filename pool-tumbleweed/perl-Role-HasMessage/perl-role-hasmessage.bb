SUMMARY = "Thing with a message method"
DESCRIPTION = "This is another extremely simple role. A class that includes \
Role::HasMessage is promising to provide a 'message' method that returns a \
string summarizing the message or event represented by the object. It does \
_not_ provide any actual behavior."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Role-HasMessage-0.007-1.3.noarch.rpm"
RPM_HASH = "b9f8382944a3a5386e1f6eb73c766291579f965614b825f49123f2d86d519d7f64fd910c623c129eed483018c5a0110437a03bfaa2d06e12cc5c06dfc5a06f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--HasMessage \
perl-Role--HasMessage--Errf \
perl-Role-HasMessage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose--Role \
perl-MooseX--Role--Parameterized \
perl-String--Errf \
perl-Try--Tiny \
perl-namespace--clean"

inherit rpm
