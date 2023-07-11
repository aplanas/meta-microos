SUMMARY = "A simple SQL tokenizer"
DESCRIPTION = "SQL::Tokenizer is a simple tokenizer for SQL queries. It does not claim to \
be a parser or query verifier. It just creates sane tokens from a valid SQL \
query. \
 \
It supports SQL with comments like: \
 \
 -- This query is used to insert a message into \
 -- logs table \
 INSERT INTO log (application, message) VALUES (?, ?) \
 \
Also supports '''', '''' and '\\'' escaping methods, so tokenizing queries \
like the one below should not be a problem: \
 \
 INSERT INTO log (application, message) \
 VALUES ('myapp', 'Hey, this is a ''single quoted string''!')"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-SQL-Tokenizer-0.24-1.27.noarch.rpm"
RPM_HASH = "e5ba3feeb50a122b29b36e56c7fe5fc3a6fca7d3a8cb7891959358f07c1cc6380eb5ea47e5c6d81d0cec51f9b2fa3abf56b69191010fb67bc82e510d436d9aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Tokenizer \
perl-SQL-Tokenizer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
