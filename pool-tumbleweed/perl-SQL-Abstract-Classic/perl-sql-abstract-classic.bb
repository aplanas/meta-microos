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

RPM_NAME = "perl-SQL-Abstract-Classic-1.91-1.13.noarch.rpm"
RPM_HASH = "5d6d6261afda2785d76437b7cddfba58f9c8269b0c594531217063617b72422cc353674b3c89b18ae00623b2952b04273c117a5e38bbb394873e3be36e703976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Classic \
perl-SQL--Abstract--Util \
perl-SQL-Abstract-Classic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-MRO--Compat \
perl-SQL--Abstract \
perl-Text--Balanced"

inherit rpm
