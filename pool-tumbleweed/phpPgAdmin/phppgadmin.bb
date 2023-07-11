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

RPM_NAME = "phpPgAdmin-7.13.0-3.2.noarch.rpm"
RPM_HASH = "91f89a5223367928c6a8a81cca7d081c4467b6163f10251830274037ed2331fb8bf649ebe9cd182ae0f95bc55a513624176c8d949da38048a481f87e7048d57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpPgAdmin \
phpPgAdmin"

RDEPENDS:${PN} += "php \
php-pgsql"

inherit rpm
