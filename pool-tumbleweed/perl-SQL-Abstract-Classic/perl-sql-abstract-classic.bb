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
your data changes, as this module figures it out."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.91"

RPM_NAME = "perl-SQL-Abstract-Classic-1.91-1.14.noarch.rpm"
RPM_HASH = "4d6b92b125308fee4e228cdec58390126a347c1b6b7cad3c664107409e11b4175a3b88ed06f7f2e9ff606ab31356f20ab8492401d83811e6f01e4cf9072f772b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Classic \
perl-SQL--Abstract--Util \
perl-SQL-Abstract-Classic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MRO--Compat \
perl-SQL--Abstract \
perl-Text--Balanced"

inherit rpm
