SUMMARY = "Serialization framework for Moose classes"
DESCRIPTION = "MooseX::Storage is a serialization framework for Moose, it provides a very \
flexible and highly pluggable way to serialize Moose classes to a number of \
different formats and styles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.53"

RPM_NAME = "perl-MooseX-Storage-0.53-1.13.noarch.rpm"
RPM_HASH = "1bd161de0006613b79d427d6a3dc3ed9de171de0b249e9bd9559d4ed3250a1e7e156f7204fb99aa075fa19d8953ee801d09e6c003bcbce579ea8a1e0af00bed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Storage) \
perl(MooseX::Storage::Base::WithChecksum) \
perl(MooseX::Storage::Basic) \
perl(MooseX::Storage::Deferred) \
perl(MooseX::Storage::Engine) \
perl(MooseX::Storage::Engine::IO::AtomicFile) \
perl(MooseX::Storage::Engine::IO::File) \
perl(MooseX::Storage::Engine::Trait::DisableCycleDetection) \
perl(MooseX::Storage::Engine::Trait::OnlyWhenBuilt) \
perl(MooseX::Storage::Format::JSON) \
perl(MooseX::Storage::Format::Storable) \
perl(MooseX::Storage::Format::YAML) \
perl(MooseX::Storage::IO::AtomicFile) \
perl(MooseX::Storage::IO::File) \
perl(MooseX::Storage::IO::StorableFile) \
perl(MooseX::Storage::Meta::Attribute::DoNotSerialize) \
perl(MooseX::Storage::Meta::Attribute::Trait::DoNotSerialize) \
perl(MooseX::Storage::Traits::DisableCycleDetection) \
perl(MooseX::Storage::Traits::OnlyWhenBuilt) \
perl(MooseX::Storage::Util) \
perl-MooseX-Storage"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::AtomicFile) \
perl(JSON::MaybeXS) \
perl(Module::Runtime) \
perl(Moose) \
perl(Moose::Meta::Attribute) \
perl(Moose::Role) \
perl(String::RewritePrefix) \
perl(YAML::Any) \
perl(namespace::autoclean)"

inherit rpm
