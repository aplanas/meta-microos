SUMMARY = "Build and install Perl modules"
DESCRIPTION = "'Module::Build' is a system for building, testing, and installing Perl \
modules. It is meant to be an alternative to 'ExtUtils::MakeMaker'. \
Developers may alter the behavior of the module through subclassing. It \
also does not require a 'make' on your system - most of the 'Module::Build' \
code is pure-perl and written in a very cross-platform way. \
 \
See 'COMPARISON' for more comparisons between 'Module::Build' and other \
installer tools. \
 \
To install 'Module::Build', and any other module that uses 'Module::Build' \
for its installation process, do the following: \
 \
  perl Build.PL       # 'Build.PL' script creates the 'Build' script \
  ./Build             # Need ./ to ensure we're using this 'Build' script \
  ./Build test        # and not another one that happens to be in the PATH \
  ./Build install \
 \
This illustrates initial configuration and the running of three 'actions'. \
In this case the actions run are 'build' (the default action), 'test', and \
'install'. Other actions defined so far include: \
 \
  build                          manifest \
  clean                          manifest_skip \
  code                           manpages \
  config_data                    pardist \
  diff                           ppd \
  dist                           ppmdist \
  distcheck                      prereq_data \
  distclean                      prereq_report \
  distdir                        pure_install \
  distinstall                    realclean \
  distmeta                       retest \
  distsign                       skipcheck \
  disttest                       test \
  docs                           testall \
  fakeinstall                    testcover \
  help                           testdb \
  html                           testpod \
  install                        testpodcoverage \
  installdeps                    versioninstall \
 \
You can run the 'help' action for a complete list of actions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.423400"

RPM_NAME = "perl-Module-Build-0.423400-1.1.noarch.rpm"
RPM_HASH = "b4012c8261dbdc40a8be0486e044195316798d3ccfbbe584ecfc2a9eb3f32286565958532abefb4df94022d60ac83f139d62e1ed1df71bde1e3fab4bec4c17d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build) \
perl(Module::Build::Base) \
perl(Module::Build::Compat) \
perl(Module::Build::Config) \
perl(Module::Build::ConfigData) \
perl(Module::Build::Cookbook) \
perl(Module::Build::Dumper) \
perl(Module::Build::Notes) \
perl(Module::Build::PPMMaker) \
perl(Module::Build::Platform::Default) \
perl(Module::Build::Platform::MacOS) \
perl(Module::Build::Platform::Unix) \
perl(Module::Build::Platform::VMS) \
perl(Module::Build::Platform::VOS) \
perl(Module::Build::Platform::Windows) \
perl(Module::Build::Platform::aix) \
perl(Module::Build::Platform::cygwin) \
perl(Module::Build::Platform::darwin) \
perl(Module::Build::Platform::os2) \
perl(Module::Build::PodParser) \
perl-Module-Build"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta) \
perl(ExtUtils::CBuilder) \
perl(ExtUtils::ParseXS) \
perl(Module::Metadata) \
perl(Perl::OSType) \
perl(TAP::Harness) \
perl(version)"

inherit rpm
