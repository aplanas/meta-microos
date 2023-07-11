SUMMARY = "Easily convert colored command line output to HTML"
DESCRIPTION = "Convert the output from a terminal command that is decorated with ANSI \
escape sequences into customizable HTML (with a small amount of code). \
 \
This module complements Parse::ANSIColor::Tiny by providing a simple HTML \
markup around its output. \
 \
Parse::ANSIColor::Tiny returns a data structure that's easy to reformat \
into any desired output. Reformatting to HTML seemed simple and common \
enough to warrant this module as well."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.105"

RPM_NAME = "perl-HTML-FromANSI-Tiny-0.105-1.10.noarch.rpm"
RPM_HASH = "7d8e4fd865e45413b3b15980f3adeeba86f241b9e28d39c153eff158f94bca373e55d96036b02df0437cba7bb4bf3c34d1bf1fa904918aa5bdda66ea2492998a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FromANSI--Tiny \
perl-HTML-FromANSI-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-Parse--ANSIColor--Tiny"

inherit rpm
