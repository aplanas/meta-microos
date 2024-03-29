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

RPM_NAME = "perl-Expect-1.35-1.24.noarch.rpm"
RPM_HASH = "b984ddbb88d41e83e90ab780d1484b6114b2253aeadeaf3a4eb3fc7dbba384fdea7b986b9310a1dff956bb376099ce98eaf78c408f051b64021563d138a76ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Expect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Pty \
perl-IO--Tty"

inherit rpm
