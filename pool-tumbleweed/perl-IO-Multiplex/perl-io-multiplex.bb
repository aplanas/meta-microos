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

RPM_NAME = "perl-IO-Multiplex-1.16-1.26.noarch.rpm"
RPM_HASH = "d68f274504c1b3e7a1a4a4b4a55fc9f85aaa85bf07d19f9744230e90cbbf30afee0f2a09d09b9f6186c018df4482651a2294c127a889182f2ec2bb889e2dc256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Multiplex) \
perl(IO::Multiplex::Handle) \
perl-IO-Multiplex"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
