SUMMARY = "Thing with a message method"
DESCRIPTION = "This is another extremely simple role. A class that includes \
Role::HasMessage is promising to provide a 'message' method that returns a \
string summarizing the message or event represented by the object. It does \
_not_ provide any actual behavior."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Role-HasMessage-0.007-1.2.noarch.rpm"
RPM_HASH = "584ce5917b1eed6c05c11405224c98d3aa218597c24a82f0036ad1fb3b556117f04e757129cc03142e5b217811c0abef4e98844667fbf9288e3d84441268539b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--HasMessage \
perl-Role--HasMessage--Errf \
perl-Role-HasMessage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose--Role \
perl-MooseX--Role--Parameterized \
perl-String--Errf \
perl-Try--Tiny \
perl-namespace--clean"

inherit rpm
