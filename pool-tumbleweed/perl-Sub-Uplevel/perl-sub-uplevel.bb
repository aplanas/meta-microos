SUMMARY = "Apparently run a function in a higher stack frame"
DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is \
just to fool caller(). All the really naughty bits of Tcl's uplevel() \
are avoided."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.2800"

RPM_NAME = "perl-Sub-Uplevel-0.2800-1.18.noarch.rpm"
RPM_HASH = "53657efd76052187a737321a651106ceabb946b5d71cc559e5432baa860f7b1ac7d5e77b1dbab5a3df7b2358def055221fce087d5864224f727ba81cfd9e31ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Sub--Uplevel \
perl-Sub-Uplevel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
