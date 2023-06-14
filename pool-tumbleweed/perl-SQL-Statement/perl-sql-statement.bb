SUMMARY = "SQL parsing and processing engine"
DESCRIPTION = "The SQL::Statement module implements a pure Perl SQL parsing and execution \
engine. While it by no means implements full ANSI standard, it does support \
many features including column and table aliases, built-in and user-defined \
functions, implicit and explicit joins, complex nested search conditions, \
and other features. \
 \
SQL::Statement is a small embeddable Database Management System (DBMS). \
This means that it provides all of the services of a simple DBMS except \
that instead of a persistent storage mechanism, it has two things: 1) an \
in-memory storage mechanism that allows you to prepare, execute, and fetch \
from SQL statements using temporary tables and 2) a set of software sockets \
where any author can plug in any storage mechanism. \
 \
There are three main uses for SQL::Statement. One or another (hopefully not \
all) may be irrelevant for your needs: 1) to access and manipulate data in \
CSV, XML, and other formats 2) to build your own DBD for a new data source \
3) to parse and examine the structure of SQL statements."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.414"

RPM_NAME = "perl-SQL-Statement-1.414-1.12.noarch.rpm"
RPM_HASH = "89df20d609f92ba225c75c8ace7a4ef4373271480245753b4efea905f302211e6fe232f829276e89ade3788902a561b1df05f23e0c3ee89f61c1a4e7e8ca8063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Dialects--ANSI \
perl-SQL--Dialects--AnyData \
perl-SQL--Dialects--CSV \
perl-SQL--Dialects--Role \
perl-SQL--Eval \
perl-SQL--Eval--Table \
perl-SQL--Parser \
perl-SQL--Statement \
perl-SQL--Statement--Aggregate \
perl-SQL--Statement--ColumnValue \
perl-SQL--Statement--ConstantTerm \
perl-SQL--Statement--Function \
perl-SQL--Statement--Function--NumericEval \
perl-SQL--Statement--Function--StrConcat \
perl-SQL--Statement--Function--SubString \
perl-SQL--Statement--Function--Trim \
perl-SQL--Statement--Function--UserFunc \
perl-SQL--Statement--Functions \
perl-SQL--Statement--GetInfo \
perl-SQL--Statement--Group \
perl-SQL--Statement--Limit \
perl-SQL--Statement--Operation \
perl-SQL--Statement--Operation--ANSI--Is \
perl-SQL--Statement--Operation--And \
perl-SQL--Statement--Operation--Between \
perl-SQL--Statement--Operation--Clike \
perl-SQL--Statement--Operation--Contains \
perl-SQL--Statement--Operation--Equal \
perl-SQL--Statement--Operation--Equality \
perl-SQL--Statement--Operation--Greater \
perl-SQL--Statement--Operation--GreaterEqual \
perl-SQL--Statement--Operation--Is \
perl-SQL--Statement--Operation--Like \
perl-SQL--Statement--Operation--Lower \
perl-SQL--Statement--Operation--LowerEqual \
perl-SQL--Statement--Operation--Neg \
perl-SQL--Statement--Operation--NotEqual \
perl-SQL--Statement--Operation--Or \
perl-SQL--Statement--Operation--Regexp \
perl-SQL--Statement--Operation--Rlike \
perl-SQL--Statement--Order \
perl-SQL--Statement--Param \
perl-SQL--Statement--Placeholder \
perl-SQL--Statement--RAM \
perl-SQL--Statement--RAM--Table \
perl-SQL--Statement--Table \
perl-SQL--Statement--TempTable \
perl-SQL--Statement--Term \
perl-SQL--Statement--TermFactory \
perl-SQL--Statement--Util \
perl-SQL--Statement--Util--Column \
perl-SQL--Statement--Util--Function \
perl-SQL-Statement"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Clone \
perl-Module--Runtime \
perl-Params--Util"

inherit rpm
