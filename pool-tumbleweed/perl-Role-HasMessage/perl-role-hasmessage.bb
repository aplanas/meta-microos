SUMMARY = "Thing with a message method"
DESCRIPTION = "This is another extremely simple role. A class that includes \
Role::HasMessage is promising to provide a 'message' method that returns a \
string summarizing the message or event represented by the object. It does \
_not_ provide any actual behavior."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Role-HasMessage-0.007-1.4.noarch.rpm"
RPM_HASH = "aea33d205af70d28a30b1a17f9013f143182ad804a7eded834ffbcda965fe678f49a0163b3aa660465318fd016a45c28a77a09db355ca190e2b70e040ae4230e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--HasMessage \
perl-Role--HasMessage--Errf \
perl-Role-HasMessage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose--Role \
perl-MooseX--Role--Parameterized \
perl-String--Errf \
perl-Try--Tiny \
perl-namespace--clean"

inherit rpm
