SUMMARY = "(DEPRECATED) Extend your attribute interfaces"
DESCRIPTION = "*This distribution is deprecated. The features it provides have been added \
to the Moose core code as Moose::Meta::Attribute::Native. This distribution \
should not be used by any new code.* \
 \
While Moose attributes provide you with a way to name your accessors, \
readers, writers, clearers and predicates, this library provides commonly \
used attribute helper methods for more specific types of data. \
 \
As seen in the SYNOPSIS, you specify the extension via the 'metaclass' \
parameter. Available meta classes are:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.25"

RPM_NAME = "perl-MooseX-AttributeHelpers-0.25-1.22.noarch.rpm"
RPM_HASH = "6179d504e3c0e5af48ecb85f3c73a0dfd4903ab7aa8c07383d2e7e1f641d2504c939996d47d6e688ce203316a456d6769a9703f8e1049f17636ae74a3c9a7847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::AttributeHelpers) \
perl(MooseX::AttributeHelpers::Bool) \
perl(MooseX::AttributeHelpers::Collection::Array) \
perl(MooseX::AttributeHelpers::Collection::Bag) \
perl(MooseX::AttributeHelpers::Collection::Hash) \
perl(MooseX::AttributeHelpers::Collection::ImmutableHash) \
perl(MooseX::AttributeHelpers::Collection::List) \
perl(MooseX::AttributeHelpers::Counter) \
perl(MooseX::AttributeHelpers::Meta::Method::Curried) \
perl(MooseX::AttributeHelpers::Meta::Method::Provided) \
perl(MooseX::AttributeHelpers::MethodProvider::Array) \
perl(MooseX::AttributeHelpers::MethodProvider::Bag) \
perl(MooseX::AttributeHelpers::MethodProvider::Bool) \
perl(MooseX::AttributeHelpers::MethodProvider::Counter) \
perl(MooseX::AttributeHelpers::MethodProvider::Hash) \
perl(MooseX::AttributeHelpers::MethodProvider::ImmutableHash) \
perl(MooseX::AttributeHelpers::MethodProvider::List) \
perl(MooseX::AttributeHelpers::MethodProvider::String) \
perl(MooseX::AttributeHelpers::Number) \
perl(MooseX::AttributeHelpers::String) \
perl(MooseX::AttributeHelpers::Trait::Base) \
perl(MooseX::AttributeHelpers::Trait::Bool) \
perl(MooseX::AttributeHelpers::Trait::Collection) \
perl(MooseX::AttributeHelpers::Trait::Collection::Array) \
perl(MooseX::AttributeHelpers::Trait::Collection::Bag) \
perl(MooseX::AttributeHelpers::Trait::Collection::Hash) \
perl(MooseX::AttributeHelpers::Trait::Collection::ImmutableHash) \
perl(MooseX::AttributeHelpers::Trait::Collection::List) \
perl(MooseX::AttributeHelpers::Trait::Counter) \
perl(MooseX::AttributeHelpers::Trait::Number) \
perl(MooseX::AttributeHelpers::Trait::String) \
perl-MooseX-AttributeHelpers"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(JSON::PP) \
perl(Moose) \
perl(Moose::Meta::Attribute) \
perl(Moose::Meta::Method) \
perl(Moose::Role) \
perl(Moose::Util::TypeConstraints)"

inherit rpm
