SUMMARY = "Organize your Mouse types in libraries"
DESCRIPTION = "Organize your Mouse types in libraries"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-MouseX-Types-0.06-11.21.noarch.rpm"
RPM_HASH = "30865ef6d564435295d77d07bca68fee0656b56e5e29a42b53aa64f26e3dd0a90807d297d1a6004fe698bb8322620baaaadd7daf341ca78f25ec1e4d865712d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types \
perl-MouseX--Types--Base \
perl-MouseX--Types--Moose \
perl-MouseX--Types--Mouse \
perl-MouseX--Types--TypeDecorator \
perl-MouseX-Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Any--Moose \
perl-Mouse"

inherit rpm
