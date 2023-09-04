SUMMARY = "Organise your Moose types in libraries"
DESCRIPTION = "The type system provided by Moose effectively makes all of its builtin type \
global, as are any types you declare with Moose. This means that every \
module that declares a type named 'PositiveInt' is sharing the same type \
object. This can be a problem when different parts of the code base want to \
use the same name for different things. \
 \
This package lets you declare types using short names, but behind the \
scenes it namespaces all your type declarations, effectively prevent name \
clashes between packages. \
 \
This is done by creating a type library module like 'MyApp::Types' and then \
importing types from that module into other modules. \
 \
As a side effect, the declaration mechanism allows you to write type names \
as barewords (really function calls), which catches typos in names at \
compile time rather than run time. \
 \
This module also provides some helper functions for using Moose types \
outside of attribute declarations. \
 \
If you mix string-based names with types created by this module, it will \
warn, with a few exceptions. If you are declaring a 'class_type()' or \
'role_type()' within your type library, or if you use a fully qualified \
name like ''MyApp::Foo''."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.50"

RPM_NAME = "perl-MooseX-Types-0.50-1.23.noarch.rpm"
RPM_HASH = "f479cbbbb93fcc272cfe9554d4253de7abcf63c06dabcb1778ba3ee16be81c03b529af7e8ca3f78e0ab79c1406c4d6b4b860a9b15ee8ffa99aad87c48f4f6efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types \
perl-MooseX--Types--Base \
perl-MooseX--Types--CheckedUtilExports \
perl-MooseX--Types--Combine \
perl-MooseX--Types--Moose \
perl-MooseX--Types--TypeDecorator \
perl-MooseX--Types--UndefinedType \
perl-MooseX--Types--Util \
perl-MooseX--Types--Wrapper \
perl-MooseX-Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Meta--TypeConstraint--Union \
perl-Moose--Util--TypeConstraints \
perl-Scalar--Util \
perl-Sub--Exporter \
perl-Sub--Exporter--ForMethods \
perl-Sub--Install \
perl-Sub--Name \
perl-namespace--autoclean"

inherit rpm
