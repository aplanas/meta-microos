SUMMARY = "Attributes with aliases for constructor arguments"
DESCRIPTION = "If you've ever wanted to be able to call an attribute any number of things \
while you're passing arguments to your object constructor, Now You Can. \
 \
The primary motivator is that I have some attributes that were named \
inconsistently, and I wanted to rename them without breaking backwards \
compatibility with my existing API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-MultiInitArg-0.02-5.25.noarch.rpm"
RPM_HASH = "16ad6be9a5240de26b90b37dad2ed27e556636e8b49a60c5e76fbb3c6f990d3d4d173a429c5e0ae6d4602c068baf16f2de0f02ecb3cd28577aa5027c515bd6ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MultiInitArg \
perl-MooseX--MultiInitArg--Attribute \
perl-MooseX--MultiInitArg--Trait \
perl-MooseX-MultiInitArg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
