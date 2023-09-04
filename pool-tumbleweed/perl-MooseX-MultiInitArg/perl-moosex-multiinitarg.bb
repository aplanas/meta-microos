SUMMARY = "Attributes with aliases for constructor arguments"
DESCRIPTION = "If you've ever wanted to be able to call an attribute any number of things \
while you're passing arguments to your object constructor, Now You Can. \
 \
The primary motivator is that I have some attributes that were named \
inconsistently, and I wanted to rename them without breaking backwards \
compatibility with my existing API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-MultiInitArg-0.02-5.26.noarch.rpm"
RPM_HASH = "149b192dcd3a94cbab4c1493306eb6a659489d35e2eda5c4bb5df60440fe651f00bcfe9962b89c23436aa467e0776634596e2984eec273a9455ce2627925cdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MultiInitArg \
perl-MooseX--MultiInitArg--Attribute \
perl-MooseX--MultiInitArg--Trait \
perl-MooseX-MultiInitArg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
