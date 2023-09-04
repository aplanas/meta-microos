SUMMARY = "Organize your Mouse types in libraries"
DESCRIPTION = "Organize your Mouse types in libraries"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-MouseX-Types-0.06-11.22.noarch.rpm"
RPM_HASH = "a7b054234ceca21f88bb29951f3342f107a04f25450605b0238555f2a7c9d786f955cf451376eaa93163cb144bf40248cebba750fee16bd7536f58f26a865fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types \
perl-MouseX--Types--Base \
perl-MouseX--Types--Moose \
perl-MouseX--Types--Mouse \
perl-MouseX--Types--TypeDecorator \
perl-MouseX-Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Any--Moose \
perl-Mouse"

inherit rpm
