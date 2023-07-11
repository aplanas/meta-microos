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

RPM_NAME = "perl-UNIVERSAL-require-0.19-1.11.noarch.rpm"
RPM_HASH = "d9c5efba3467ff6fbf211df5d7d9f82884e781af103db1a2abf5b9e94d71f244d3858411e31d9a86c1c8bb13f16db5780f5333ba0eb1d73b2980d00666c2b984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL \
perl-UNIVERSAL--require \
perl-UNIVERSAL-require"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
