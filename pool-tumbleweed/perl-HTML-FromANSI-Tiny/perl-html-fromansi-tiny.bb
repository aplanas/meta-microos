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

RPM_NAME = "perl-HTML-FromANSI-Tiny-0.105-1.11.noarch.rpm"
RPM_HASH = "30d4cebe3144fbfba0fa9f7b5c6d63cd591657158fa5f5d1376aa19cdf40afee8651e8ab7e8a74b98ba6e7c283db12774d55ee6ed4fbd627d30bb316500f215a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FromANSI--Tiny \
perl-HTML-FromANSI-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Entities \
perl-Parse--ANSIColor--Tiny"

inherit rpm
