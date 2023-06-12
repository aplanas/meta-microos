SUMMARY = "Standalone, extensible Perl module installer"
DESCRIPTION = "*Module::Install* is a package for writing installers for CPAN (or \
CPAN-like) distributions that are clean, simple, minimalist, act in a \
strictly correct manner with ExtUtils::MakeMaker, and will run on any Perl \
installation version 5.005 or newer. \
 \
The intent is to make it as easy as possible for CPAN authors (and \
especially for first-time CPAN authors) to have installers that follow all \
the best practices for distribution installation, but involve as much DWIM \
(Do What I Mean) as possible when writing them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.21"

RPM_NAME = "perl-Module-Install-1.21-1.1.noarch.rpm"
RPM_HASH = "64fe27ca770b8cdd5bba15189d6a29aa6c3904a57014f65e85c4c6c55f19443a174961900ef99aeaca6c99c7588068d4ea5af43ac2803c5e88391cd93e411316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::AutoInstall) \
perl(Module::Install) \
perl(Module::Install::Admin) \
perl(Module::Install::Admin::Bundle) \
perl(Module::Install::Admin::Compiler) \
perl(Module::Install::Admin::Find) \
perl(Module::Install::Admin::Include) \
perl(Module::Install::Admin::Makefile) \
perl(Module::Install::Admin::Manifest) \
perl(Module::Install::Admin::Metadata) \
perl(Module::Install::Admin::ScanDeps) \
perl(Module::Install::Admin::WriteAll) \
perl(Module::Install::AutoInstall) \
perl(Module::Install::Base) \
perl(Module::Install::Base::FakeAdmin) \
perl(Module::Install::Bundle) \
perl(Module::Install::Can) \
perl(Module::Install::Compiler) \
perl(Module::Install::Deprecated) \
perl(Module::Install::External) \
perl(Module::Install::Fetch) \
perl(Module::Install::Include) \
perl(Module::Install::Inline) \
perl(Module::Install::MakeMaker) \
perl(Module::Install::Makefile) \
perl(Module::Install::Metadata) \
perl(Module::Install::PAR) \
perl(Module::Install::Run) \
perl(Module::Install::Scripts) \
perl(Module::Install::Share) \
perl(Module::Install::Win32) \
perl(Module::Install::With) \
perl(Module::Install::WriteAll) \
perl(inc::Module::Install) \
perl-Module-Install"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::PPPort) \
perl(ExtUtils::Install) \
perl(ExtUtils::MakeMaker) \
perl(ExtUtils::ParseXS) \
perl(File::Remove) \
perl(File::Spec) \
perl(Module::Build) \
perl(Module::CoreList) \
perl(Module::ScanDeps) \
perl(Parse::CPAN::Meta) \
perl(YAML::Tiny)"

inherit rpm
