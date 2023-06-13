SUMMARY = "Generate Kwalitee ratings for a distribution"
DESCRIPTION = "Generate Kwalitee ratings for a distribution"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Module-CPANTS-Analyse-1.01-1.9.noarch.rpm"
RPM_HASH = "07ba0421697971666dc078367e414255bf7e6cb4c54c420dce458180f0ee68dcbaa1b1f2dff6dd48eb050d841ed5ee5904f32986dd0c29fea6fcba73536fab54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::CPANTS::Analyse) \
perl(Module::CPANTS::Kwalitee) \
perl(Module::CPANTS::Kwalitee::BrokenInstaller) \
perl(Module::CPANTS::Kwalitee::CpantsErrors) \
perl(Module::CPANTS::Kwalitee::Distname) \
perl(Module::CPANTS::Kwalitee::Distros) \
perl(Module::CPANTS::Kwalitee::Files) \
perl(Module::CPANTS::Kwalitee::FindModules) \
perl(Module::CPANTS::Kwalitee::License) \
perl(Module::CPANTS::Kwalitee::Manifest) \
perl(Module::CPANTS::Kwalitee::MetaYML) \
perl(Module::CPANTS::Kwalitee::NeedsCompiler) \
perl(Module::CPANTS::Kwalitee::Pod) \
perl(Module::CPANTS::Kwalitee::Prereq) \
perl(Module::CPANTS::Kwalitee::Repackageable) \
perl(Module::CPANTS::Kwalitee::Signature) \
perl(Module::CPANTS::Kwalitee::Uses) \
perl(Module::CPANTS::Kwalitee::Version) \
perl-Module-CPANTS-Analyse"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Any::Lite) \
perl(Archive::Tar) \
perl(Array::Diff) \
perl(CPAN::DistnameInfo) \
perl(CPAN::Meta::Validator) \
perl(CPAN::Meta::YAML) \
perl(Class::Accessor) \
perl(Data::Binary) \
perl(File::Find::Object) \
perl(JSON::PP) \
perl(List::Util) \
perl(Module::Find) \
perl(Perl::PrereqScanner::NotQuiteLite) \
perl(Software::License) \
perl(version)"

inherit rpm
