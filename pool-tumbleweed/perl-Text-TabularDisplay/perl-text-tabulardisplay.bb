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

RPM_NAME = "perl-Text-TabularDisplay-1.38-3.27.noarch.rpm"
RPM_HASH = "a75a07fef7a359e8a507fd917f03f85f0dc13e05579ae062a17970b4281a970f0dc8d0bf5b6c10523f74c11fbdc3602aaf208607611ad17b1629c498a00194ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--TabularDisplay \
perl-Text-TabularDisplay"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
