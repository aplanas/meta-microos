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

RPM_NAME = "perl-Text-TabularDisplay-1.38-3.28.noarch.rpm"
RPM_HASH = "0f71fa6212a682da1738a366405e59b9a9a896e408b92ff0ba0a4a476aead7cb6800e4ab4b5e756ba35f29b1cc2edfeded0b8d9c94d56bc3ba230fc8a9862da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--TabularDisplay \
perl-Text-TabularDisplay"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
