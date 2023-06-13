SUMMARY = "Administration of PostgreSQL over the web"
DESCRIPTION = "phpPgAdmin is a web-based administration tool for PostgreSQL. It is \
perfect for PostgreSQL DBAs, newbies and hosting services. \
 \
Features \
 \
* Administer multiple servers \
* Support for PostgreSQL 9.x.x, 10.x, 11.x, 12.x \
* Manage all aspects of: \
	o Users & groups \
	o Databases \
	o Schemas \
	o Tables, indexes, constraints, triggers, rules & privileges \
	o Views, sequences & functions \
	o Advanced objects \
	o Reports \
* Easy data manipulation: \
	o Browse tables, views & reports \
	o Execute arbitrary SQL \
	o Select, insert, update and delete \
* Dump table data in a variety of formats: SQL, COPY, XML, XHTML, CSV, Tabbed, pg_dump \
* Import SQL scripts, COPY data, XML, CSV and Tabbed \
* Supports the Slony master-slave replication engine \
* Excellent language support: \
	o Available in 27 languages \
	o No encoding conflicts. Edit Russian data using a Japanese interface! \
* Easy to install and configure"
LICENSE = "GPL-2.0-or-later"

PV = "7.13.0"

RPM_NAME = "phpPgAdmin-7.13.0-3.1.noarch.rpm"
RPM_HASH = "fa3bb0fcbc772667d123efd94a3ce181af9e58b233174b029c8fea65f5282c105fb6c561f359aa659176e6d2fefbd50ea47efb8f4c540bea6f8de35ea774b284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(phpPgAdmin) \
phpPgAdmin"

RDEPENDS:${PN} += "php \
php-pgsql"

inherit rpm
