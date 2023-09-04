SUMMARY = "Set default of an attribute to a value from %ENV"
DESCRIPTION = "This is a Moose attribute trait that you use when you want the default \
value for an attribute to be populated from the %ENV hash. So, for example \
if you have set the environment variable USERNAME = 'John' you can do: \
 \
	package MyApp::MyClass; \
 \
	use Moose; \
	use MooseX::Attribute::ENV; \
 \
	has 'username' => (is=>'ro', traits=>['ENV']); \
 \
	package main; \
 \
	my $myclass = MyApp::MyClass->new(); \
 \
	print $myclass->username; # STDOUT => 'John'; \
 \
This is basically similar functionality to something like: \
 \
	has 'attr' => ( \
		is=>'ro', \
		default=> sub { \
			$ENV{uc 'attr'}; \
		}, \
	); \
 \
but this module has a few other features that offer merit, as well as being \
a simple enough attribute trait that I hope it can serve as a learning \
tool. \
 \
If the named key isn't found in %ENV, then defaults will execute as normal."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-Attribute-ENV-0.02-2.21.noarch.rpm"
RPM_HASH = "082007c6b60ad10e8be46860090f55f2062912c46353ff5b777e6037020a6a5ac378890e2f4e10ca26f4973f81e725099d12e8832c1489b0d2b60bf6afe239a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Trait--ENV \
perl-MooseX--Attribute--ENV \
perl-MooseX-Attribute-ENV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
