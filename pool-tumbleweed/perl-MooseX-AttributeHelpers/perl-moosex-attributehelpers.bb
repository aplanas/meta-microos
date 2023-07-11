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

RPM_NAME = "perl-MooseX-AttributeHelpers-0.25-1.23.noarch.rpm"
RPM_HASH = "589abdc95eb78efdfea81ba466f41d5b60139eba6af96edf91d2bee7fc397b29b3a1e3c0af47a6a971a17d71d54886e4a6d3a8a4cff4062b15f6fb2e0b734475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--AttributeHelpers \
perl-MooseX--AttributeHelpers--Bool \
perl-MooseX--AttributeHelpers--Collection--Array \
perl-MooseX--AttributeHelpers--Collection--Bag \
perl-MooseX--AttributeHelpers--Collection--Hash \
perl-MooseX--AttributeHelpers--Collection--ImmutableHash \
perl-MooseX--AttributeHelpers--Collection--List \
perl-MooseX--AttributeHelpers--Counter \
perl-MooseX--AttributeHelpers--Meta--Method--Curried \
perl-MooseX--AttributeHelpers--Meta--Method--Provided \
perl-MooseX--AttributeHelpers--MethodProvider--Array \
perl-MooseX--AttributeHelpers--MethodProvider--Bag \
perl-MooseX--AttributeHelpers--MethodProvider--Bool \
perl-MooseX--AttributeHelpers--MethodProvider--Counter \
perl-MooseX--AttributeHelpers--MethodProvider--Hash \
perl-MooseX--AttributeHelpers--MethodProvider--ImmutableHash \
perl-MooseX--AttributeHelpers--MethodProvider--List \
perl-MooseX--AttributeHelpers--MethodProvider--String \
perl-MooseX--AttributeHelpers--Number \
perl-MooseX--AttributeHelpers--String \
perl-MooseX--AttributeHelpers--Trait--Base \
perl-MooseX--AttributeHelpers--Trait--Bool \
perl-MooseX--AttributeHelpers--Trait--Collection \
perl-MooseX--AttributeHelpers--Trait--Collection--Array \
perl-MooseX--AttributeHelpers--Trait--Collection--Bag \
perl-MooseX--AttributeHelpers--Trait--Collection--Hash \
perl-MooseX--AttributeHelpers--Trait--Collection--ImmutableHash \
perl-MooseX--AttributeHelpers--Trait--Collection--List \
perl-MooseX--AttributeHelpers--Trait--Counter \
perl-MooseX--AttributeHelpers--Trait--Number \
perl-MooseX--AttributeHelpers--Trait--String \
perl-MooseX-AttributeHelpers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON--PP \
perl-Moose \
perl-Moose--Meta--Attribute \
perl-Moose--Meta--Method \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
