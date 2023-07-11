SUMMARY = "Apparently run a function in a higher stack frame"
DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is \
just to fool caller(). All the really naughty bits of Tcl's uplevel() \
are avoided."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.2800"

RPM_NAME = "perl-Sub-Uplevel-0.2800-1.17.noarch.rpm"
RPM_HASH = "5dedb69ff73307b82d3b87fe4bdd6bea2dd44ba03ea1ab5cbbe2246053e8cb826e5b13ed79a092f374bf9867e5f481199890395c82dc272cfe617b365cea2052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Sub--Uplevel \
perl-Sub-Uplevel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
