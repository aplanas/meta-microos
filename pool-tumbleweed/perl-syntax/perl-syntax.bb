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

RPM_NAME = "perl-syntax-0.004-5.26.noarch.rpm"
RPM_HASH = "c73061532c1aa6bf8f070fa55ffb646189ddd415384ac5ea2504b7c7f1a6e81e219932d00295175882064ba982505c7c546d21ad12b4731640e3548f96b77971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-syntax"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--OptList \
perl-namespace--clean"

inherit rpm
