SUMMARY = "Build external dependencies for use in CPAN"
DESCRIPTION = "This module provides tools for building external (non-CPAN) dependencies \
for CPAN. It is mainly designed to be used at install time of a CPAN \
client, and work closely with Alien::Base which is used at runtime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.80"

RPM_NAME = "perl-Alien-Build-2.80-1.1.aarch64.rpm"
RPM_HASH = "29bbc8554bedafd3fb922a04e022b18e0dc667270a34926261bd3ea125005cc88eba4a26a16400c3a62dd0cb963c3eb7c9c9bc811739b78cf1239e9291c8ea34"

RPROVIDES:${PN} += "perl(Alien::Base) \
perl(Alien::Base::PkgConfig) \
perl(Alien::Base::Wrapper) \
perl(Alien::Build) \
perl(Alien::Build::CommandSequence) \
perl(Alien::Build::Helper) \
perl(Alien::Build::Interpolate) \
perl(Alien::Build::Interpolate::Default) \
perl(Alien::Build::Interpolate::Helper) \
perl(Alien::Build::Log) \
perl(Alien::Build::Log::Abbreviate) \
perl(Alien::Build::Log::Default) \
perl(Alien::Build::MM) \
perl(Alien::Build::Meta) \
perl(Alien::Build::Plugin) \
perl(Alien::Build::Plugin::Build::Autoconf) \
perl(Alien::Build::Plugin::Build::CMake) \
perl(Alien::Build::Plugin::Build::Copy) \
perl(Alien::Build::Plugin::Build::MSYS) \
perl(Alien::Build::Plugin::Build::Make) \
perl(Alien::Build::Plugin::Build::SearchDep) \
perl(Alien::Build::Plugin::Core::CleanInstall) \
perl(Alien::Build::Plugin::Core::Download) \
perl(Alien::Build::Plugin::Core::FFI) \
perl(Alien::Build::Plugin::Core::Gather) \
perl(Alien::Build::Plugin::Core::Legacy) \
perl(Alien::Build::Plugin::Core::Override) \
perl(Alien::Build::Plugin::Core::Setup) \
perl(Alien::Build::Plugin::Core::Tail) \
perl(Alien::Build::Plugin::Decode::DirListing) \
perl(Alien::Build::Plugin::Decode::DirListingFtpcopy) \
perl(Alien::Build::Plugin::Decode::HTML) \
perl(Alien::Build::Plugin::Decode::Mojo) \
perl(Alien::Build::Plugin::Digest::Negotiate) \
perl(Alien::Build::Plugin::Digest::SHA) \
perl(Alien::Build::Plugin::Digest::SHAPP) \
perl(Alien::Build::Plugin::Download::Negotiate) \
perl(Alien::Build::Plugin::Extract::ArchiveTar) \
perl(Alien::Build::Plugin::Extract::ArchiveZip) \
perl(Alien::Build::Plugin::Extract::CommandLine) \
perl(Alien::Build::Plugin::Extract::Directory) \
perl(Alien::Build::Plugin::Extract::File) \
perl(Alien::Build::Plugin::Extract::Negotiate) \
perl(Alien::Build::Plugin::Fetch::CurlCommand) \
perl(Alien::Build::Plugin::Fetch::HTTPTiny) \
perl(Alien::Build::Plugin::Fetch::LWP) \
perl(Alien::Build::Plugin::Fetch::Local) \
perl(Alien::Build::Plugin::Fetch::LocalDir) \
perl(Alien::Build::Plugin::Fetch::NetFTP) \
perl(Alien::Build::Plugin::Fetch::Wget) \
perl(Alien::Build::Plugin::Gather::IsolateDynamic) \
perl(Alien::Build::Plugin::PkgConfig::CommandLine) \
perl(Alien::Build::Plugin::PkgConfig::LibPkgConf) \
perl(Alien::Build::Plugin::PkgConfig::MakeStatic) \
perl(Alien::Build::Plugin::PkgConfig::Negotiate) \
perl(Alien::Build::Plugin::PkgConfig::PP) \
perl(Alien::Build::Plugin::Prefer::BadVersion) \
perl(Alien::Build::Plugin::Prefer::GoodVersion) \
perl(Alien::Build::Plugin::Prefer::SortVersions) \
perl(Alien::Build::Plugin::Probe::CBuilder) \
perl(Alien::Build::Plugin::Probe::CommandLine) \
perl(Alien::Build::Plugin::Probe::Vcpkg) \
perl(Alien::Build::Plugin::Test::Mock) \
perl(Alien::Build::PluginMeta) \
perl(Alien::Build::Temp) \
perl(Alien::Build::TempDir) \
perl(Alien::Build::Util) \
perl(Alien::Build::Version::Basic) \
perl(Alien::Build::rc) \
perl(Alien::Role) \
perl(Alien::Util) \
perl(Test::Alien) \
perl(Test::Alien::Build) \
perl(Test::Alien::CanCompile) \
perl(Test::Alien::CanPlatypus) \
perl(Test::Alien::Diag) \
perl(Test::Alien::Run) \
perl(Test::Alien::Synthetic) \
perl(alienfile) \
perl-Alien-Build \
perl-Alien-Build(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Capture::Tiny) \
perl(Digest::SHA) \
perl(ExtUtils::CBuilder) \
perl(ExtUtils::MakeMaker) \
perl(ExtUtils::ParseXS) \
perl(FFI::CheckLib) \
perl(File::Which) \
perl(File::chdir) \
perl(JSON::PP) \
perl(List::Util) \
perl(Path::Tiny) \
perl(Test2::API) \
perl(Text::ParseWords) \
perl(parent)"

inherit rpm
