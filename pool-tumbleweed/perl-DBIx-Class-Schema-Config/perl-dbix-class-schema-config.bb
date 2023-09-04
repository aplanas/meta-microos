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

RPM_NAME = "perl-DBIx-Class-Schema-Config-0.001014-1.11.noarch.rpm"
RPM_HASH = "e0a953276aac0c65145d5c026eb1468b1830261c74cd228c7233f02f5606eb930e80cea8043f5eccb2969055f3f3cda7cbf974ef3f18cc99f15042c99ae27e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--Schema--Config \
perl-DBIx-Class-Schema-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--Any \
perl-DBD--SQLite \
perl-DBIx--Class \
perl-DBIx--Class--Schema \
perl-File--HomeDir \
perl-Hash--Merge \
perl-URI \
perl-namespace--clean"

inherit rpm
