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

RPM_NAME = "perl-SQL-Abstract-Classic-1.91-1.15.noarch.rpm"
RPM_HASH = "c1a1f7ffe6b63810ac7dc500e8e473f4ce2c9cd149587ae48c94fe3f5e6287aac0857e6b31685b611d7af2da22adf06695ac3bc608c75484229f1230cd57f09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Classic \
perl-SQL--Abstract--Util \
perl-SQL-Abstract-Classic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MRO--Compat \
perl-SQL--Abstract \
perl-Text--Balanced"

inherit rpm
