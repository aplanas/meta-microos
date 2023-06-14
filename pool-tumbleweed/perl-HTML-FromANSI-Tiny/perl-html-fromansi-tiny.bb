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

RPM_NAME = "perl-HTML-FromANSI-Tiny-0.105-1.9.noarch.rpm"
RPM_HASH = "8bd882b931ce8aa92d0dce6928dfe0cbe992788ee50fc5b7c76c35137d78e9700a4cdb0042ac2eaf461f69ffdd2d82b770b01813a9b939d19a6566be56bafc0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FromANSI--Tiny \
perl-HTML-FromANSI-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-HTML--Entities \
perl-Parse--ANSIColor--Tiny"

inherit rpm
