SUMMARY = "Distribution builder; installer not included!"
DESCRIPTION = "Dist::Zilla builds distributions of code to be uploaded to the CPAN. In \
this respect, it is like ExtUtils::MakeMaker, Module::Build, or \
Module::Install. Unlike those tools, however, it is not also a system for \
installing code that has been downloaded from the CPAN. Since it's only run \
by authors, and is meant to be run on a repository checkout rather than on \
published, released code, it can do much more than those tools, and is free \
to make much more ludicrous demands in terms of prerequisites. \
 \
If you have access to the web, you can learn more and find an interactive \
tutorial at *at https://dzil.org/*. If not, try Dist::Zilla::Tutorial."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.030"

RPM_NAME = "perl-Dist-Zilla-6.030-1.1.noarch.rpm"
RPM_HASH = "3017d7689b4c88062b82ad5f159c19d6b3d3b3ba33c141b49ff293f2df433ed1365d72151be427bbf0471c70d6dc29e437bc9eac94eb2911c091a0027d941da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Dist::Zilla) \
perl(Dist::Zilla::App) \
perl(Dist::Zilla::App::Command) \
perl(Dist::Zilla::App::Command::add) \
perl(Dist::Zilla::App::Command::authordeps) \
perl(Dist::Zilla::App::Command::build) \
perl(Dist::Zilla::App::Command::clean) \
perl(Dist::Zilla::App::Command::install) \
perl(Dist::Zilla::App::Command::listdeps) \
perl(Dist::Zilla::App::Command::new) \
perl(Dist::Zilla::App::Command::nop) \
perl(Dist::Zilla::App::Command::release) \
perl(Dist::Zilla::App::Command::run) \
perl(Dist::Zilla::App::Command::setup) \
perl(Dist::Zilla::App::Command::smoke) \
perl(Dist::Zilla::App::Command::test) \
perl(Dist::Zilla::App::Command::version) \
perl(Dist::Zilla::App::Tester) \
perl(Dist::Zilla::App::Tester::Result) \
perl(Dist::Zilla::Chrome::Term) \
perl(Dist::Zilla::Chrome::Test) \
perl(Dist::Zilla::Dist::Builder) \
perl(Dist::Zilla::Dist::Minter) \
perl(Dist::Zilla::File::FromCode) \
perl(Dist::Zilla::File::InMemory) \
perl(Dist::Zilla::File::OnDisk) \
perl(Dist::Zilla::MVP::Assembler) \
perl(Dist::Zilla::MVP::Assembler::GlobalConfig) \
perl(Dist::Zilla::MVP::Assembler::Zilla) \
perl(Dist::Zilla::MVP::Reader::Finder) \
perl(Dist::Zilla::MVP::Reader::Perl) \
perl(Dist::Zilla::MVP::RootSection) \
perl(Dist::Zilla::MVP::Section) \
perl(Dist::Zilla::MintingProfile::Default) \
perl(Dist::Zilla::Path) \
perl(Dist::Zilla::Plugin::AutoPrereqs) \
perl(Dist::Zilla::Plugin::AutoVersion) \
perl(Dist::Zilla::Plugin::CPANFile) \
perl(Dist::Zilla::Plugin::ConfirmRelease) \
perl(Dist::Zilla::Plugin::DistINI) \
perl(Dist::Zilla::Plugin::Encoding) \
perl(Dist::Zilla::Plugin::ExecDir) \
perl(Dist::Zilla::Plugin::ExtraTests) \
perl(Dist::Zilla::Plugin::FakeRelease) \
perl(Dist::Zilla::Plugin::FileFinder::ByName) \
perl(Dist::Zilla::Plugin::FileFinder::Filter) \
perl(Dist::Zilla::Plugin::FinderCode) \
perl(Dist::Zilla::Plugin::GatherDir) \
perl(Dist::Zilla::Plugin::GatherDir::Template) \
perl(Dist::Zilla::Plugin::GatherFile) \
perl(Dist::Zilla::Plugin::GenerateFile) \
perl(Dist::Zilla::Plugin::InlineFiles) \
perl(Dist::Zilla::Plugin::License) \
perl(Dist::Zilla::Plugin::MakeMaker) \
perl(Dist::Zilla::Plugin::MakeMaker::Runner) \
perl(Dist::Zilla::Plugin::Manifest) \
perl(Dist::Zilla::Plugin::ManifestSkip) \
perl(Dist::Zilla::Plugin::MetaConfig) \
perl(Dist::Zilla::Plugin::MetaJSON) \
perl(Dist::Zilla::Plugin::MetaNoIndex) \
perl(Dist::Zilla::Plugin::MetaResources) \
perl(Dist::Zilla::Plugin::MetaTests) \
perl(Dist::Zilla::Plugin::MetaYAML) \
perl(Dist::Zilla::Plugin::ModuleBuild) \
perl(Dist::Zilla::Plugin::ModuleShareDirs) \
perl(Dist::Zilla::Plugin::NextRelease) \
perl(Dist::Zilla::Plugin::PkgDist) \
perl(Dist::Zilla::Plugin::PkgVersion) \
perl(Dist::Zilla::Plugin::PodCoverageTests) \
perl(Dist::Zilla::Plugin::PodSyntaxTests) \
perl(Dist::Zilla::Plugin::PodVersion) \
perl(Dist::Zilla::Plugin::Prereqs) \
perl(Dist::Zilla::Plugin::PruneCruft) \
perl(Dist::Zilla::Plugin::PruneFiles) \
perl(Dist::Zilla::Plugin::Readme) \
perl(Dist::Zilla::Plugin::RemovePrereqs) \
perl(Dist::Zilla::Plugin::ShareDir) \
perl(Dist::Zilla::Plugin::TemplateModule) \
perl(Dist::Zilla::Plugin::TestRelease) \
perl(Dist::Zilla::Plugin::UploadToCPAN) \
perl(Dist::Zilla::PluginBundle::Basic) \
perl(Dist::Zilla::PluginBundle::Classic) \
perl(Dist::Zilla::PluginBundle::FakeClassic) \
perl(Dist::Zilla::PluginBundle::Filter) \
perl(Dist::Zilla::Pragmas) \
perl(Dist::Zilla::Prereqs) \
perl(Dist::Zilla::Role::AfterBuild) \
perl(Dist::Zilla::Role::AfterMint) \
perl(Dist::Zilla::Role::AfterRelease) \
perl(Dist::Zilla::Role::ArchiveBuilder) \
perl(Dist::Zilla::Role::BeforeArchive) \
perl(Dist::Zilla::Role::BeforeBuild) \
perl(Dist::Zilla::Role::BeforeMint) \
perl(Dist::Zilla::Role::BeforeRelease) \
perl(Dist::Zilla::Role::BuildPL) \
perl(Dist::Zilla::Role::BuildRunner) \
perl(Dist::Zilla::Role::Chrome) \
perl(Dist::Zilla::Role::ConfigDumper) \
perl(Dist::Zilla::Role::EncodingProvider) \
perl(Dist::Zilla::Role::ExecFiles) \
perl(Dist::Zilla::Role::File) \
perl(Dist::Zilla::Role::FileFinder) \
perl(Dist::Zilla::Role::FileFinderUser) \
perl(Dist::Zilla::Role::FileGatherer) \
perl(Dist::Zilla::Role::FileInjector) \
perl(Dist::Zilla::Role::FileMunger) \
perl(Dist::Zilla::Role::FilePruner) \
perl(Dist::Zilla::Role::InstallTool) \
perl(Dist::Zilla::Role::LicenseProvider) \
perl(Dist::Zilla::Role::MetaProvider) \
perl(Dist::Zilla::Role::MintingProfile) \
perl(Dist::Zilla::Role::MintingProfile::ShareDir) \
perl(Dist::Zilla::Role::ModuleMaker) \
perl(Dist::Zilla::Role::MutableFile) \
perl(Dist::Zilla::Role::NameProvider) \
perl(Dist::Zilla::Role::PPI) \
perl(Dist::Zilla::Role::Plugin) \
perl(Dist::Zilla::Role::PluginBundle) \
perl(Dist::Zilla::Role::PluginBundle::Easy) \
perl(Dist::Zilla::Role::PrereqScanner) \
perl(Dist::Zilla::Role::PrereqSource) \
perl(Dist::Zilla::Role::ReleaseStatusProvider) \
perl(Dist::Zilla::Role::Releaser) \
perl(Dist::Zilla::Role::ShareDir) \
perl(Dist::Zilla::Role::Stash) \
perl(Dist::Zilla::Role::Stash::Authors) \
perl(Dist::Zilla::Role::Stash::Login) \
perl(Dist::Zilla::Role::StubBuild) \
perl(Dist::Zilla::Role::TestRunner) \
perl(Dist::Zilla::Role::TextTemplate) \
perl(Dist::Zilla::Role::VersionProvider) \
perl(Dist::Zilla::Stash::Mint) \
perl(Dist::Zilla::Stash::PAUSE) \
perl(Dist::Zilla::Stash::Rights) \
perl(Dist::Zilla::Stash::User) \
perl(Dist::Zilla::Tester) \
perl(Dist::Zilla::Tester::_Builder) \
perl(Dist::Zilla::Tester::_Minter) \
perl(Dist::Zilla::Tutorial) \
perl(Dist::Zilla::Types) \
perl(Dist::Zilla::Util) \
perl(Dist::Zilla::Util::AuthorDeps) \
perl(Test::DZil) \
perl-Dist-Zilla"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(App::Cmd::Command::version) \
perl(App::Cmd::Setup) \
perl(App::Cmd::Tester) \
perl(App::Cmd::Tester::CaptureExternal) \
perl(Archive::Tar) \
perl(CPAN::Meta::Converter) \
perl(CPAN::Meta::Merge) \
perl(CPAN::Meta::Prereqs) \
perl(CPAN::Meta::Requirements) \
perl(CPAN::Meta::Validator) \
perl(CPAN::Uploader) \
perl(Config::INI::Reader) \
perl(Config::MVP) \
perl(Config::MVP::Assembler) \
perl(Config::MVP::Assembler::WithBundles) \
perl(Config::MVP::Reader) \
perl(Config::MVP::Reader::Findable::ByExtension) \
perl(Config::MVP::Reader::Finder) \
perl(Config::MVP::Reader::INI) \
perl(Config::MVP::Section) \
perl(Data::Section) \
perl(DateTime) \
perl(ExtUtils::Manifest) \
perl(File::Copy::Recursive) \
perl(File::Find::Rule) \
perl(File::ShareDir) \
perl(File::ShareDir::Install) \
perl(File::pushd) \
perl(JSON::MaybeXS) \
perl(List::Util) \
perl(Log::Dispatchouli) \
perl(Mixin::Linewise::Readers) \
perl(Module::CoreList) \
perl(Module::Runtime) \
perl(Moose) \
perl(Moose::Role) \
perl(Moose::Util::TypeConstraints) \
perl(MooseX::LazyRequire) \
perl(MooseX::Role::Parameterized) \
perl(MooseX::SetOnce) \
perl(MooseX::Types) \
perl(MooseX::Types::Moose) \
perl(MooseX::Types::Perl) \
perl(PPI::Document) \
perl(Params::Util) \
perl(Path::Tiny) \
perl(Perl::PrereqScanner) \
perl(Pod::Simple) \
perl(Software::License) \
perl(Software::LicenseUtils) \
perl(String::Formatter) \
perl(String::RewritePrefix) \
perl(Sub::Exporter) \
perl(Sub::Exporter::ForMethods) \
perl(Sub::Exporter::Util) \
perl(Term::ANSIColor) \
perl(Term::Encoding) \
perl(Term::ReadKey) \
perl(Term::UI) \
perl(Test::Deep) \
perl(Text::Glob) \
perl(Text::Template) \
perl(Try::Tiny) \
perl(YAML::Tiny) \
perl(autodie) \
perl(experimental) \
perl(namespace::autoclean) \
perl(parent) \
perl(version)"

inherit rpm
