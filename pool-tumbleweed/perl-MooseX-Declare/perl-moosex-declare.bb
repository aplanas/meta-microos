SUMMARY = "(DEPRECATED) Declarative syntax for Moose"
DESCRIPTION = "This module provides syntactic sugar for Moose, the postmodern object \
system for Perl 5. When used, it sets up the 'class' and 'role' keywords. \
 \
*Note:* Please see the the /WARNING manpage section below!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.43"

RPM_NAME = "perl-MooseX-Declare-0.43-1.24.noarch.rpm"
RPM_HASH = "e7789492f52b6f98ac50fff645f7ed7401419bf096b230347257d129be254729a516404638e0e3096c3928489ecd7848172f9288e1800cc59f9b2675f0c22f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Declare \
perl-MooseX--Declare--Context \
perl-MooseX--Declare--Context--Namespaced \
perl-MooseX--Declare--Context--Parameterized \
perl-MooseX--Declare--Syntax--EmptyBlockIfMissing \
perl-MooseX--Declare--Syntax--Extending \
perl-MooseX--Declare--Syntax--InnerSyntaxHandling \
perl-MooseX--Declare--Syntax--Keyword--Class \
perl-MooseX--Declare--Syntax--Keyword--Clean \
perl-MooseX--Declare--Syntax--Keyword--Method \
perl-MooseX--Declare--Syntax--Keyword--MethodModifier \
perl-MooseX--Declare--Syntax--Keyword--Namespace \
perl-MooseX--Declare--Syntax--Keyword--Role \
perl-MooseX--Declare--Syntax--Keyword--With \
perl-MooseX--Declare--Syntax--KeywordHandling \
perl-MooseX--Declare--Syntax--MethodDeclaration \
perl-MooseX--Declare--Syntax--MooseSetup \
perl-MooseX--Declare--Syntax--NamespaceHandling \
perl-MooseX--Declare--Syntax--OptionHandling \
perl-MooseX--Declare--Syntax--RoleApplication \
perl-MooseX--Declare--Util \
perl-MooseX-Declare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Declare \
perl-Devel--Declare--Context--Simple \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Meta--Class \
perl-Moose--Role \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Method--Signatures \
perl-MooseX--Method--Signatures--Meta--Method \
perl-MooseX--Method--Signatures--Types \
perl-MooseX--Role--Parameterized \
perl-MooseX--Types--Moose \
perl-Parse--Method--Signatures \
perl-Parse--Method--Signatures--Param--Placeholder \
perl-Sub--Exporter \
perl-Sub--Install \
perl-aliased \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
