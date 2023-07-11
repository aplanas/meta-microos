SUMMARY = "Generate SQL from Perl data structures"
DESCRIPTION = "This module was inspired by the excellent DBIx::Abstract. However, in using \
that module I found that what I really wanted to do was generate SQL, but \
still retain complete control over my statement handles and use the DBI \
interface. So, I set out to create an abstract SQL generation module. \
 \
While based on the concepts used by DBIx::Abstract, there are several \
important differences, especially when it comes to WHERE clauses. I have \
modified the concepts used to make the SQL easier to generate from Perl \
data structures and, IMO, more intuitive. The underlying idea is for this \
module to do what you mean, based on the data structures you provide it. \
The big advantage is that you don't have to modify your code every time \
your data changes, as this module figures it out. \
 \
To begin with, an SQL INSERT is as easy as just specifying a hash of \
'key=value' pairs: \
 \
    my %data = ( \
        name => 'Jimbo Bobson', \
        phone => '123-456-7890', \
        address => '42 Sister Lane', \
        city => 'St. Louis', \
        state => 'Louisiana', \
    ); \
 \
The SQL can then be generated with this: \
 \
    my($stmt, @bind) = $sql->insert('people', \\%data); \
 \
Which would give you something like this: \
 \
    $stmt = 'INSERT INTO people \
                    (address, city, name, phone, state) \
                    VALUES (?, ?, ?, ?, ?)'; \
    @bind = ('42 Sister Lane', 'St. Louis', 'Jimbo Bobson', \
             '123-456-7890', 'Louisiana'); \
 \
These are then used directly in your DBI code: \
 \
    my $sth = $dbh->prepare($stmt); \
    $sth->execute(@bind);"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000001"

RPM_NAME = "perl-SQL-Abstract-2.000001-1.11.noarch.rpm"
RPM_HASH = "84fa21c04994ea9fc6f557e37608e3d8a4e218e439a8b21bd3c9908a6f1a34b306b9d1f3505e3c69368e96a428e801c1a1c966ba974c6a0370c1e4b8a449d1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--SQLMaker--Role--SQLA2Passthrough \
perl-DBIx--Class--Storage--Debug--PrettyPrint \
perl-SQL--Abstract \
perl-SQL--Abstract--Formatter \
perl-SQL--Abstract--Parts \
perl-SQL--Abstract--Plugin--BangOverrides \
perl-SQL--Abstract--Plugin--ExtraClauses \
perl-SQL--Abstract--Reference \
perl-SQL--Abstract--Role--Plugin \
perl-SQL--Abstract--Test \
perl-SQL--Abstract--Tree \
perl-SQL-Abstract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hash--Merge \
perl-MRO--Compat \
perl-Moo \
perl-Sub--Quote \
perl-Test--Builder--Module \
perl-Test--Deep \
perl-Text--Balanced"

inherit rpm
