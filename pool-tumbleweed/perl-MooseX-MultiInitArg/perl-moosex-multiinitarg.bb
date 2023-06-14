SUMMARY = "Attributes with aliases for constructor arguments"
DESCRIPTION = "If you've ever wanted to be able to call an attribute any number of things \
while you're passing arguments to your object constructor, Now You Can. \
 \
The primary motivator is that I have some attributes that were named \
inconsistently, and I wanted to rename them without breaking backwards \
compatibility with my existing API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-MultiInitArg-0.02-5.24.noarch.rpm"
RPM_HASH = "b241f921dd31f8370ef6b5d6173a5b84d02725bd9d03a086dc9a7fdc717fd09f9d028a8a53aa1ec3c1fe280e370dba830e05acdde58502c3714c1ea70a59bf70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MultiInitArg \
perl-MooseX--MultiInitArg--Attribute \
perl-MooseX--MultiInitArg--Trait \
perl-MooseX-MultiInitArg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose"

inherit rpm
