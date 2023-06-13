SUMMARY = "Colored & full-featured pretty print of Perl data structures and objects"
DESCRIPTION = "The ever-popular Data::Dumper is a fantastic tool, meant to stringify data \
structures in a way they are suitable for being 'eval''ed back in. The \
thing is, a lot of people keep using it (and similar ones, like Data::Dump) \
to print data structures and objects on screen for inspection and \
debugging, and while you _can_ use those modules for that, it doesn't mean \
you _should_. \
 \
This is where Data::Printer comes in. It is meant to do one thing and one \
thing only: \
 \
_format Perl variables and objects to be inspected by a human_ \
 \
If you want to serialize/store/restore Perl data structures, this module \
will NOT help you. Try Storable, Data::Dumper, JSON, or whatever. CPAN is \
full of such solutions! \
 \
Whenever you type 'use Data::Printer' or 'use DDP', we export two functions \
to your namespace:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001000"

RPM_NAME = "perl-Data-Printer-1.001000-1.2.noarch.rpm"
RPM_HASH = "30ed7cd3296ce4b0843234ab4241200b10c4484fc80e1bf0efe63998b42355d2484220d1ff3c6a2382a31966a11d337d4afb43137bb564356e1cbc3627664446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DDP) \
perl(Data::Printer) \
perl(Data::Printer::Common) \
perl(Data::Printer::Config) \
perl(Data::Printer::Filter) \
perl(Data::Printer::Filter::ARRAY) \
perl(Data::Printer::Filter::CODE) \
perl(Data::Printer::Filter::ContentType) \
perl(Data::Printer::Filter::DB) \
perl(Data::Printer::Filter::DateTime) \
perl(Data::Printer::Filter::Digest) \
perl(Data::Printer::Filter::FORMAT) \
perl(Data::Printer::Filter::GLOB) \
perl(Data::Printer::Filter::GenericClass) \
perl(Data::Printer::Filter::HASH) \
perl(Data::Printer::Filter::REF) \
perl(Data::Printer::Filter::Regexp) \
perl(Data::Printer::Filter::SCALAR) \
perl(Data::Printer::Filter::VSTRING) \
perl(Data::Printer::Filter::Web) \
perl(Data::Printer::Object) \
perl(Data::Printer::Profile) \
perl(Data::Printer::Profile::Dumper) \
perl(Data::Printer::Profile::JSON) \
perl(Data::Printer::Theme) \
perl(Data::Printer::Theme::Classic) \
perl(Data::Printer::Theme::Material) \
perl(Data::Printer::Theme::Monokai) \
perl(Data::Printer::Theme::Solarized) \
perl-Data-Printer"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(version)"

inherit rpm
