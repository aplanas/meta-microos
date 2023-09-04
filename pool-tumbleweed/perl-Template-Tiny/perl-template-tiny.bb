SUMMARY = "Template Toolkit reimplemented in as little code as possible"
DESCRIPTION = "*Template::Tiny* is a reimplementation of a subset of the functionality \
from Template Toolkit in as few lines of code as possible. \
 \
It is intended for use in light-usage, low-memory, or low-cpu templating \
situations, where you may need to upgrade to the full feature set in the \
future, or if you want the retain the familiarity of TT-style templates. \
 \
For the subset of functionality it implements, it has fully-compatible \
template and stash API. All templates used with *Template::Tiny* should be \
able to be transparently upgraded to full Template Toolkit. \
 \
Unlike Template Toolkit, *Template::Tiny* will process templates without a \
compile phase (but despite this is still quicker, owing to heavy use of the \
Perl regular expression engine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.14"

RPM_NAME = "perl-Template-Tiny-1.14-1.11.noarch.rpm"
RPM_HASH = "534e59c747569a86ca2f932d93d185f88422c54fb586ac4dc9388c8b2dcf88dcf6e2c370840ccbc07d53ee721d12c7ac846c97666f558fad5ca5cbef712f7045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Tiny \
perl-Template-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
