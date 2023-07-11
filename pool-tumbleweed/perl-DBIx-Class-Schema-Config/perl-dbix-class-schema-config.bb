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

RPM_NAME = "perl-DBIx-Class-Schema-Config-0.001014-1.10.noarch.rpm"
RPM_HASH = "e902efd98d937a2d8fa947e1388d3a871e4f59680e78acb066bbca6d59c825bd61b580efd3ad9f255d46e47019a97e4419d89444c6e07ebf3a39213f808a48ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--Schema--Config \
perl-DBIx-Class-Schema-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--Any \
perl-DBD--SQLite \
perl-DBIx--Class \
perl-DBIx--Class--Schema \
perl-File--HomeDir \
perl-Hash--Merge \
perl-URI \
perl-namespace--clean"

inherit rpm
