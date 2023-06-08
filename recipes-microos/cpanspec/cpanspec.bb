SUMMARY = "Generate a SUSE spec file for a CPAN module"
DESCRIPTION = "*cpanspec* will generate a spec file to build a rpm from a CPAN-style Perl \
module distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.83.00.1674496263.ba76ec9"

RPM_NAME = "cpanspec-1.83.00.1674496263.ba76ec9-1.1.noarch.rpm"
RPM_HASH = "9ec3f0550f89334d836d3244af0e253cff6bc27bf67d80310f5a5eab683ab86b1a629843ebc01666fb3ea19fc2b788a3f541332cdfd5d8347457212380b77d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanspec perl(CPAN2OBS) perl(PodViewSpec)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Algorithm::Diff) perl(Archive::Tar) perl(Archive::Zip) perl(Class::Accessor::Chained) perl(File::ShareDir::Install) perl(LWP::UserAgent) perl(Module::Build::Tiny) perl(Parse::CPAN::Packages) perl(Perl::PrereqScanner) perl(Pod::POM) perl(Pod::Simple::TextContent) perl(Text::Autoformat) perl(Text::Capitalize) perl(YAML) perl(YAML::XS)"

inherit rpm
