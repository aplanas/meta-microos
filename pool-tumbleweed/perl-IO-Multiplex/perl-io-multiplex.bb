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

RPM_NAME = "perl-IO-Multiplex-1.16-1.27.noarch.rpm"
RPM_HASH = "7736efe4cead1ee265128522f6682c0175b7a3c1ebf087a8e683a605693b0574c413c46cc789b657ea2fc696be0196aab082aff72475ad307965cc0ce484a5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Multiplex \
perl-IO--Multiplex--Handle \
perl-IO-Multiplex"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
