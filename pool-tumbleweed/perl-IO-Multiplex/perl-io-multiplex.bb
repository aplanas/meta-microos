SUMMARY = "Manage IO on many file handles"
DESCRIPTION = "It is object oriented in design, and will notify you of significant events \
by calling methods on an object that you supply. If you are not using \
objects, you can simply supply '__PACKAGE__' instead of an object \
reference. \
 \
You may have one callback object registered for each file handle, or one \
global one. Possibly both -- the per-file handle callback object will be \
used instead of the global one. \
 \
Each file handle may also have a timer associated with it. A callback \
function is called when the timer expires."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.16"

RPM_NAME = "perl-IO-Multiplex-1.16-1.28.noarch.rpm"
RPM_HASH = "d260ca7923c17233053ddb3a8af4e0911303fbb0c303c6827b71dcb57edb7078c3120ab4758883fe45ad049060dddc501b5b37204aed966834495b4c2edc0163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Multiplex \
perl-IO--Multiplex--Handle \
perl-IO-Multiplex"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
