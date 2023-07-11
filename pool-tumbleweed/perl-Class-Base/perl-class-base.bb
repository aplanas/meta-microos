SUMMARY = "Useful Base Class for Deriving Other Modules"
DESCRIPTION = "Please consider using Badger::Base instead which is the successor of this \
module. \
 \
This module implements a simple base class from which other modules can be \
derived, thereby inheriting a number of useful methods such as 'new()', \
'init()', 'params()', 'clone()', 'error()' and 'debug()'. \
 \
For a number of years, I found myself re-writing this module for \
practically every Perl project of any significant size. Or rather, I would \
copy the module from the last project and perform a global search and \
replace to change the names. Each time it got a little more polished and \
eventually, I decided to Do The Right Thing and release it as a module in \
it's own right. \
 \
It doesn't pretend to be an all-encompassing solution for every kind of \
object creation problem you might encounter. In fact, it only supports \
blessed hash references that are created using the popular, but by no means \
universal convention of calling 'new()' with a list or reference to a hash \
array of named parameters. Constructor failure is indicated by returning \
undef and setting the '$ERROR' package variable in the module's class to \
contain a relevant message (which you can also fetch by calling 'error()' \
as a class method). \
 \
e.g. \
 \
    my $object = My::Module->new( \
	file => 'myfile.html', \
	msg  => 'Hello World' \
    ) || die $My::Module::ERROR; \
 \
or: \
 \
    my $object = My::Module->new({ \
	file => 'myfile.html', \
	msg  => 'Hello World', \
    }) || die My::Module->error(); \
 \
The 'new()' method handles the conversion of a list of arguments into a \
hash array and calls the 'init()' method to perform any initialisation. In \
many cases, it is therefore sufficient to define a module like so: \
 \
    package My::Module; \
    use Class::Base; \
    use base qw( Class::Base ); \
 \
    sub init { \
	my ($self, $config) = @_; \
	 \
	$self->params($config, qw( FOO BAR )) || return undef; \
	return $self; \
    } \
 \
     \
 \
    1; \
 \
Then you can go right ahead and use it like this: \
 \
    use My::Module; \
 \
    my $object = My::Module->new( FOO => 'the foo value', \
				  BAR => 'the bar value' ) \
        || die $My::Module::ERROR; \
 \
Despite its limitations, Class::Base can be a surprisingly useful module to \
have lying around for those times where you just want to create a regular \
object based on a blessed hash reference and don't want to worry too much \
about duplicating the same old code to bless a hash, define configuration \
values, provide an error reporting mechanism, and so on. Simply derive your \
module from 'Class::Base' and leave it to worry about most of the detail. \
And don't forget, you can always redefine your own 'new()', 'error()', or \
other method, if you don't like the way the Class::Base version works."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-Class-Base-0.09-1.20.noarch.rpm"
RPM_HASH = "51d13bfb70c6ff80db01f2e014fc4d251c6b137b7ee426a0459cbbf832c96575ecd5bdba1525a22e864eb616ff0a3a79623dd56b931ace5aa45e3222ac59fb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Base \
perl-Class-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Clone"

inherit rpm
