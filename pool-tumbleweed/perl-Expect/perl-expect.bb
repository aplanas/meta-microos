SUMMARY = "Automate Interactions with Command Line Programs That Expose a Text Term[cut]"
DESCRIPTION = "See an explanation of at http://code-maven.com/expect \
 \
The Expect module is a successor of Comm.pl and a descendent of Chat.pl. It \
more closely resembles the Tcl Expect language than its predecessors. It \
does not contain any of the networking code found in Comm.pl. I suspect \
this would be obsolete anyway given the advent of IO::Socket and external \
tools such as netcat. \
 \
Expect.pm is an attempt to have more of a switch() & case feeling to make \
decision processing more fluid. Three separate types of debugging have been \
implemented to make code production easier. \
 \
It is possible to interconnect multiple file handles (and processes) much \
like Tcl's Expect. An attempt was made to enable all the features of Tcl's \
Expect without forcing Tcl on the victim programmer :-) . \
 \
Please, before you consider using Expect, read the FAQs about 'I want to \
automate password entry for su/ssh/scp/rsh/...' and 'I want to use Expect \
to automate [anything with a buzzword]...'"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.35"

RPM_NAME = "perl-Expect-1.35-1.23.noarch.rpm"
RPM_HASH = "728cae90c97bc4fabaf70c1bcd134887feec22e3f3b0a03e9a10adcb519fd7a4eff362005492f96a2d53b8184d9610179697a756b67fa721e0b610f677e817cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Expect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Pty \
perl-IO--Tty"

inherit rpm
