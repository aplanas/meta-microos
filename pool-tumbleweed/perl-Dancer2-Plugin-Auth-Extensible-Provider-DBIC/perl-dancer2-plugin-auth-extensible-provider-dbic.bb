SUMMARY = "Authenticate via the Dancer2::Plugin::DBIC plugin"
DESCRIPTION = "This class is an authentication provider designed to authenticate users \
against a database, using Dancer2::Plugin::DBIC to access a database. \
 \
See Dancer2::Plugin::DBIC for how to configure a database connection \
appropriately; see the CONFIGURATION section below for how to configure \
this authentication provider with database details. \
 \
See Dancer2::Plugin::Auth::Extensible for details on how to use the \
authentication framework."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.624"

RPM_NAME = "perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC-0.624-1.11.noarch.rpm"
RPM_HASH = "e1e6bba183b3f781194397cab0293904e8010c85ebb94ae207ef264eae3ee64e54717512161836cf6a68c95798888d7121ba66340bdba464001e172ba662eaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--Auth--Extensible--Provider--DBIC \
perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DBIx--Class--ResultClass--HashRefInflator \
perl-Dancer2 \
perl-Dancer2--Core--Types \
perl-Dancer2--Plugin--Auth--Extensible \
perl-Dancer2--Plugin--DBIC \
perl-DateTime \
perl-Moo \
perl-String--CamelCase \
perl-namespace--clean"

inherit rpm
