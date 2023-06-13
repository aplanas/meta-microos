SUMMARY = "Determine if a given Path resembles a development source tree"
DESCRIPTION = "This module is more or less a bunch of heuristics for determining if a \
given path is a development tree root of some kind. \
 \
This has many useful applications, notably ones that require behaviours for \
'installed' modules to be different to those that are still 'in \
development'"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001003"

RPM_NAME = "perl-Path-IsDev-1.001003-1.22.noarch.rpm"
RPM_HASH = "e174fd883115c6cf67a2120de17c1ec1a9d866a298de0f281a7f7119a261986323ab708994497f4fe4428ef70919739e1d97aac9958eb8aa2ee4fcd16dc31a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Path::IsDev) \
perl(Path::IsDev::Heuristic::Changelog) \
perl(Path::IsDev::Heuristic::DevDirMarker) \
perl(Path::IsDev::Heuristic::META) \
perl(Path::IsDev::Heuristic::MYMETA) \
perl(Path::IsDev::Heuristic::Makefile) \
perl(Path::IsDev::Heuristic::TestDir) \
perl(Path::IsDev::Heuristic::Tool::Dzil) \
perl(Path::IsDev::Heuristic::Tool::MakeMaker) \
perl(Path::IsDev::Heuristic::Tool::ModuleBuild) \
perl(Path::IsDev::Heuristic::VCS::Git) \
perl(Path::IsDev::HeuristicSet::Basic) \
perl(Path::IsDev::NegativeHeuristic::HomeDir) \
perl(Path::IsDev::NegativeHeuristic::IsDev::IgnoreFile) \
perl(Path::IsDev::NegativeHeuristic::PerlINC) \
perl(Path::IsDev::Object) \
perl(Path::IsDev::Result) \
perl(Path::IsDev::Role::Heuristic) \
perl(Path::IsDev::Role::HeuristicSet) \
perl(Path::IsDev::Role::HeuristicSet::Simple) \
perl(Path::IsDev::Role::Matcher::Child::BaseName::MatchRegexp) \
perl(Path::IsDev::Role::Matcher::Child::BaseName::MatchRegexp::File) \
perl(Path::IsDev::Role::Matcher::Child::Exists::Any) \
perl(Path::IsDev::Role::Matcher::Child::Exists::Any::Dir) \
perl(Path::IsDev::Role::Matcher::Child::Exists::Any::File) \
perl(Path::IsDev::Role::Matcher::FullPath::Is::Any) \
perl(Path::IsDev::Role::NegativeHeuristic) \
perl-Path-IsDev"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Tiny) \
perl(File::HomeDir) \
perl(Module::Runtime) \
perl(Path::Tiny) \
perl(Role::Tiny) \
perl(Role::Tiny::With) \
perl(Sub::Exporter)"

inherit rpm
