SUMMARY = "Extensible DBIx::Class deployment"
DESCRIPTION = "'DBIx::Class::DeploymentHandler' is, as its name suggests, a tool for \
deploying and upgrading databases with DBIx::Class. It is designed to be \
much more flexible than DBIx::Class::Schema::Versioned, hence the use of \
Moose and lots of roles. \
 \
'DBIx::Class::DeploymentHandler' itself is just a recommended set of roles \
that we think will not only work well for everyone, but will also yield the \
best overall mileage. Each role it uses has its own nuances and \
documentation, so I won't describe all of them here, but here are a few of \
the major benefits over how DBIx::Class::Schema::Versioned worked (and \
DBIx::Class::DeploymentHandler::Deprecated tries to maintain compatibility \
with): \
 \
  * Downgrades in addition to upgrades. \
 \
  * Multiple sql files files per upgrade/downgrade/install. \
 \
  * Perl scripts allowed for upgrade/downgrade/install. \
 \
  * Just one set of files needed for upgrade, unlike before where one might \
need to generate 'factorial(scalar @versions)', which is just silly. \
 \
  * And much, much more! \
 \
That's really just a taste of some of the differences. Check out each role \
for all the details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.002233"

RPM_NAME = "perl-DBIx-Class-DeploymentHandler-0.002233-1.17.noarch.rpm"
RPM_HASH = "eb964649a6f5e199bee9cbe874077b2a8aaeade2953417694ba2cf085eae798e96522729c706045f34b319bf0ad754f9362ec7d2097c11cab4250f4cb29754aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--DeploymentHandler \
perl-DBIx--Class--DeploymentHandler--Dad \
perl-DBIx--Class--DeploymentHandler--DeployMethod--SQL--Translator \
perl-DBIx--Class--DeploymentHandler--DeployMethod--SQL--Translator--Deprecated \
perl-DBIx--Class--DeploymentHandler--DeployMethod--SQL--Translator--ScriptHelpers \
perl-DBIx--Class--DeploymentHandler--Deprecated \
perl-DBIx--Class--DeploymentHandler--HandlesDeploy \
perl-DBIx--Class--DeploymentHandler--HandlesVersionStorage \
perl-DBIx--Class--DeploymentHandler--HandlesVersioning \
perl-DBIx--Class--DeploymentHandler--LogImporter \
perl-DBIx--Class--DeploymentHandler--LogRouter \
perl-DBIx--Class--DeploymentHandler--Logger \
perl-DBIx--Class--DeploymentHandler--Types \
perl-DBIx--Class--DeploymentHandler--VersionHandler--DatabaseToSchemaVersions \
perl-DBIx--Class--DeploymentHandler--VersionHandler--ExplicitVersions \
perl-DBIx--Class--DeploymentHandler--VersionHandler--Monotonic \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Deprecated \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Deprecated--Component \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Deprecated--VersionResult \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Deprecated--VersionResultSet \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Standard \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Standard--Component \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Standard--VersionResult \
perl-DBIx--Class--DeploymentHandler--VersionStorage--Standard--VersionResultSet \
perl-DBIx--Class--DeploymentHandler--WithApplicatorDumple \
perl-DBIx--Class--DeploymentHandler--WithReasonableDefaults \
perl-DBIx-Class-DeploymentHandler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-Context--Preserve \
perl-DBIx--Class \
perl-Log--Contextual \
perl-Module--Runtime \
perl-Moose \
perl-MooseX--Role--Parameterized \
perl-Path--Class \
perl-SQL--SplitStatement \
perl-SQL--Translator \
perl-Sub--Exporter--Progressive \
perl-Text--Brew \
perl-Try--Tiny \
perl-YAML \
perl-autodie \
perl-namespace--autoclean \
perl-parent"

inherit rpm
