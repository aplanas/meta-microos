SUMMARY = "Require() modules from a variable [deprecated]"
DESCRIPTION = "Before using this module, you should look at the alternatives, some of \
which are listed in SEE ALSO below. \
 \
This module provides a safe mechanism for loading a module at runtime, when \
you have the name of the module in a variable. \
 \
If you've ever had to do this... \
 \
    eval 'require $module'; \
 \
to get around the bareword caveats on require(), this module is for you. It \
creates a universal require() class method that will work with every Perl \
module and its secure. So instead of doing some arcane eval() work, you can \
do this: \
 \
    $module->require; \
 \
It doesn't save you much typing, but it'll make a lot more sense to someone \
who's not a ninth level Perl acolyte."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-UNIVERSAL-require-0.19-1.12.noarch.rpm"
RPM_HASH = "d03f8957d925dd5b1d6767565185823ac611fa0dc1f48ad9225201939942746c50a1da75e0109c5b494eb72a6d3d6d1fed84eb901ce42c001873a1a23acc8660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL \
perl-UNIVERSAL--require \
perl-UNIVERSAL-require"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
