SUMMARY = "the module to clean up old dists from your PAUSE home directory"
DESCRIPTION = "The module provides means to clean up your PAUSE home directory from old \
distributions with ability to undelete files if you so prefer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001002"

RPM_NAME = "perl-WWW-PAUSE-CleanUpHomeDir-1.001002-1.23.noarch.rpm"
RPM_HASH = "354f6977f112711db5e16e4e12874618d63ca5c88f5b28cf3d34858dc502269e53f72995e9f9ed3165228006736c5eb1009393c1e2b1b3b5a12d45f2dfa6ec91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(WWW::PAUSE::CleanUpHomeDir) \
perl-WWW-PAUSE-CleanUpHomeDir"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor::Grouped) \
perl(Devel::TakeHashArgs) \
perl(HTML::TokeParser::Simple) \
perl(Sort::Versions) \
perl(URI) \
perl(WWW::Mechanize)"

inherit rpm
