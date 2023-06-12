SUMMARY = "Credential Management for DBIx::Class"
DESCRIPTION = "DBIx::Class::Schema::Config is a subclass of DBIx::Class::Schema that \
allows the loading of credentials & configuration from a file. The actual \
code itself would only need to know about the name used in the \
configuration file. This aims to make it simpler for operations teams to \
manage database credentials. \
 \
A simple tutorial that compliments this documentation and explains \
converting an existing DBIx::Class Schema to use this software to manage \
credentials can be found at \
http://www.symkat.com/credential-management-in-dbix-class"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001014"

RPM_NAME = "perl-DBIx-Class-Schema-Config-0.001014-1.9.noarch.rpm"
RPM_HASH = "64079cbeda5439d27a0f09200afa1025af6f0e44a4c6d7af9b86de5381d8f006f4548dee7cfa0ea063e80118be2d40267528fa16a241f48bc31101659a0585f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Class::Schema::Config) \
perl-DBIx-Class-Schema-Config"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Config::Any) \
perl(DBD::SQLite) \
perl(DBIx::Class) \
perl(DBIx::Class::Schema) \
perl(File::HomeDir) \
perl(Hash::Merge) \
perl(URI) \
perl(namespace::clean)"

inherit rpm
