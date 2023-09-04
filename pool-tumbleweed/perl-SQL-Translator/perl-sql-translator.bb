SUMMARY = "SQL DDL transformations and more"
DESCRIPTION = "This documentation covers the API for SQL::Translator. For a more general \
discussion of how to use the modules and scripts, please see \
SQL::Translator::Manual. \
 \
SQL::Translator is a group of Perl modules that converts vendor-specific \
SQL table definitions into other formats, such as other vendor-specific \
SQL, ER diagrams, documentation (POD and HTML), XML, and Class::DBI \
classes. The main focus of SQL::Translator is SQL, but parsers exist for \
other structured data formats, including Excel spreadsheets and arbitrarily \
delimited text files. Through the separation of the code into parsers and \
producers with an object model in between, it's possible to combine any \
parser with any producer, to plug in custom parsers or producers, or to \
manipulate the parsed data via the built-in object model. Presently only \
the definition parts of SQL are handled (CREATE, ALTER), not the \
manipulation of data (INSERT, UPDATE, DELETE)."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "1.63"

RPM_NAME = "perl-SQL-Translator-1.63-1.3.noarch.rpm"
RPM_HASH = "f718700b78deaac8ff6412e86b81e401a79aa26bed5470191d2f198044cca1c367172002cffe734858dfa448c1e9a9aaa2d46ac8ca88826d0347db5f984e1031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--RecDescent--SQL--Translator--Parser--DB2--Grammar \
perl-SQL--Translator \
perl-SQL--Translator--Diff \
perl-SQL--Translator--Filter--DefaultExtra \
perl-SQL--Translator--Filter--Globals \
perl-SQL--Translator--Filter--Names \
perl-SQL--Translator--Generator--DDL--MySQL \
perl-SQL--Translator--Generator--DDL--PostgreSQL \
perl-SQL--Translator--Generator--DDL--SQLServer \
perl-SQL--Translator--Generator--DDL--SQLite \
perl-SQL--Translator--Generator--Role--DDL \
perl-SQL--Translator--Generator--Role--Quote \
perl-SQL--Translator--Parser \
perl-SQL--Translator--Parser--Access \
perl-SQL--Translator--Parser--DB2 \
perl-SQL--Translator--Parser--DB2--Grammar \
perl-SQL--Translator--Parser--DBI \
perl-SQL--Translator--Parser--DBI--DB2 \
perl-SQL--Translator--Parser--DBI--MySQL \
perl-SQL--Translator--Parser--DBI--Oracle \
perl-SQL--Translator--Parser--DBI--PostgreSQL \
perl-SQL--Translator--Parser--DBI--SQLServer \
perl-SQL--Translator--Parser--DBI--SQLite \
perl-SQL--Translator--Parser--DBI--Sybase \
perl-SQL--Translator--Parser--Excel \
perl-SQL--Translator--Parser--JSON \
perl-SQL--Translator--Parser--MySQL \
perl-SQL--Translator--Parser--Oracle \
perl-SQL--Translator--Parser--PostgreSQL \
perl-SQL--Translator--Parser--SQLServer \
perl-SQL--Translator--Parser--SQLite \
perl-SQL--Translator--Parser--Storable \
perl-SQL--Translator--Parser--Sybase \
perl-SQL--Translator--Parser--XML \
perl-SQL--Translator--Parser--XML--SQLFairy \
perl-SQL--Translator--Parser--YAML \
perl-SQL--Translator--Parser--xSV \
perl-SQL--Translator--Producer \
perl-SQL--Translator--Producer--ClassDBI \
perl-SQL--Translator--Producer--DB2 \
perl-SQL--Translator--Producer--DiaUml \
perl-SQL--Translator--Producer--Diagram \
perl-SQL--Translator--Producer--Dumper \
perl-SQL--Translator--Producer--GraphViz \
perl-SQL--Translator--Producer--HTML \
perl-SQL--Translator--Producer--JSON \
perl-SQL--Translator--Producer--Latex \
perl-SQL--Translator--Producer--MySQL \
perl-SQL--Translator--Producer--Oracle \
perl-SQL--Translator--Producer--POD \
perl-SQL--Translator--Producer--PostgreSQL \
perl-SQL--Translator--Producer--SQLServer \
perl-SQL--Translator--Producer--SQLite \
perl-SQL--Translator--Producer--Storable \
perl-SQL--Translator--Producer--Sybase \
perl-SQL--Translator--Producer--TT--Base \
perl-SQL--Translator--Producer--TT--Table \
perl-SQL--Translator--Producer--TTSchema \
perl-SQL--Translator--Producer--XML \
perl-SQL--Translator--Producer--XML--SQLFairy \
perl-SQL--Translator--Producer--YAML \
perl-SQL--Translator--Role--BuildArgs \
perl-SQL--Translator--Role--Debug \
perl-SQL--Translator--Role--Error \
perl-SQL--Translator--Role--ListAttr \
perl-SQL--Translator--Schema \
perl-SQL--Translator--Schema--Constants \
perl-SQL--Translator--Schema--Constraint \
perl-SQL--Translator--Schema--Field \
perl-SQL--Translator--Schema--Index \
perl-SQL--Translator--Schema--Object \
perl-SQL--Translator--Schema--Procedure \
perl-SQL--Translator--Schema--Role--Compare \
perl-SQL--Translator--Schema--Role--Extra \
perl-SQL--Translator--Schema--Table \
perl-SQL--Translator--Schema--Trigger \
perl-SQL--Translator--Schema--View \
perl-SQL--Translator--Types \
perl-SQL--Translator--Utils \
perl-SQL--Translator--Utils--Error \
perl-SQL-Translator \
perl-Test--SQL--Translator"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-DBI \
perl-Digest--SHA \
perl-File--ShareDir \
perl-Moo \
perl-Package--Variant \
perl-Parse--RecDescent \
perl-Sub--Quote \
perl-Try--Tiny"

inherit rpm
