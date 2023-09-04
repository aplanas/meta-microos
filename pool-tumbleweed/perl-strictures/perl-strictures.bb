SUMMARY = "Turn on strict and make most warnings fatal"
DESCRIPTION = "I've been writing the equivalent of this module at the top of my code for \
about a year now. I figured it was time to make it shorter. \
 \
Things like the importer in 'use Moose' don't help me because they turn \
warnings on but don't make them fatal -- which from my point of view is \
useless because I want an exception to tell me my code isn't \
warnings-clean. \
 \
Any time I see a warning from my code, that indicates a mistake. \
 \
Any time my code encounters a mistake, I want a crash -- not spew to STDERR \
and then unknown (and probably undesired) subsequent behaviour. \
 \
I also want to ensure that obvious coding mistakes, like indirect object \
syntax (and not so obvious mistakes that cause things to accidentally \
compile as such) get caught, but not at the cost of an XS dependency and \
not at the cost of blowing things up on another machine. \
 \
Therefore, strictures turns on additional checking, but only when it thinks \
it's running in a test file in a VCS checkout -- although if this causes \
undesired behaviour this can be overridden by setting the \
'PERL_STRICTURES_EXTRA' environment variable. \
 \
If additional useful author side checks come to mind, I'll add them to the \
'PERL_STRICTURES_EXTRA' code path only -- this will result in a minor \
version increase (e.g. 1.000000 to 1.001000 (1.1.0) or similar). Any fixes \
only to the mechanism of this code will result in a sub-version increase \
(e.g. 1.000000 to 1.000001 (1.0.1))."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000006"

RPM_NAME = "perl-strictures-2.000006-1.17.noarch.rpm"
RPM_HASH = "69c774ee238358896708a19b4d3271d1b293a143390e144b362bba6b4d1095d2f4a6c990b8ea34b9b772e12735c3a21370c19319cc8e864895e3803a7403058d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-strictures \
perl-strictures--extra"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
