SUMMARY = "Succinct options for Moose"
DESCRIPTION = "This module provides a succinct syntax for declaring options for the Moose \
manpage attributes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-MooseX-Has-Options-0.003-5.27.noarch.rpm"
RPM_HASH = "330559b8f72a8aa9466f76af85036f7fa037b002a847289a2b846b664bed064055f7ca2164a618cb5d9aa64652d28e75b2755e220bd4829e62634a1a1f647321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Has--Options \
perl-MooseX--Has--Options--Handler--Accessors \
perl-MooseX--Has--Options--Handler--NativeTypes \
perl-MooseX--Has--Options--Handler--NoInit \
perl-MooseX-Has-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Load \
perl-List--MoreUtils \
perl-Package--Stash \
perl-String--RewritePrefix"

inherit rpm
