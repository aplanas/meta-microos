SUMMARY = "Display text in formatted table output"
DESCRIPTION = "Text::TabularDisplay simplifies displaying textual data in a table. The \
output is identical to the columnar display of query results in the mysql \
text monitor. For example, this data: \
 \
    1, 'Tom Jones', '(666) 555-1212' \
    2, 'Barnaby Jones', '(666) 555-1213' \
    3, 'Bridget Jones', '(666) 555-1214' \
 \
Used like so: \
 \
    my $t = Text::TabularDisplay->new(qw(id name phone)); \
    $t->add(1, 'Tom Jones', '(666) 555-1212'); \
    $t->add(2, 'Barnaby Jones', '(666) 555-1213'); \
    $t->add(3, 'Bridget Jones', '(666) 555-1214'); \
    print $t->render; \
 \
Produces: \
 \
    +----+---------------+----------------+ \
    | id | name          | phone          | \
    +----+---------------+----------------+ \
    | 1  | Tom Jones     | (666) 555-1212 | \
    | 2  | Barnaby Jones | (666) 555-1213 | \
    | 3  | Bridget Jones | (666) 555-1214 | \
    +----+---------------+----------------+"
LICENSE = "GPL-2.0"

PV = "1.38"

RPM_NAME = "perl-Text-TabularDisplay-1.38-3.26.noarch.rpm"
RPM_HASH = "4f3a75da95aeab9667bdc85854849915f8fa81071051c663c23cf4f0fc4104af8a2030658d4ddb60892b69f34a069ac31a837d77f1bb4077dbe433457b06fea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--TabularDisplay \
perl-Text-TabularDisplay"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
