SUMMARY = "Activate syntax extensions"
DESCRIPTION = "This module activates community provided syntax extensions to Perl. You \
pass it a feature name, and optionally a scalar with arguments, and the \
dispatching system will load and install the extension in your package. \
 \
The import arguments are parsed with the Data::OptList manpage. There are \
no standardised options. Please consult the documentation for the specific \
syntax feature to find out about possible configuration options. \
 \
The passed in feature names are simply transformed: 'function' becomes the \
Syntax::Feature::Function manpage and 'foo_bar' would become \
'Syntax::Feature::FooBar'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-syntax-0.004-5.27.noarch.rpm"
RPM_HASH = "1baa93590027b10a6272eb0a4fcecec1655595ae536e6100851c412b651629c25b18cd4c2db7951023644fbf21b2c03214f672ce83d3f19eeb0fb4f143e75039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-syntax"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--OptList \
perl-namespace--clean"

inherit rpm
