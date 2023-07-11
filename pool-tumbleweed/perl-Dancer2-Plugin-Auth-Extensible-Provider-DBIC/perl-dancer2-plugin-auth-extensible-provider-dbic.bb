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

RPM_NAME = "perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC-0.624-1.12.noarch.rpm"
RPM_HASH = "01bb2b333c50d8702cee8477622af35fbf0d9a2d6582b76ace993d10197a8de44b6f2eac86d50d6274b2051fdab67f0f3995d1d464f5317d0547e61e6f26c7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--Auth--Extensible--Provider--DBIC \
perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
