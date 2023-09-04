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

RPM_NAME = "perl-SQL-Tokenizer-0.24-1.28.noarch.rpm"
RPM_HASH = "2c7ab6bdc054323c0791021b9385bbc2e402bfd59381450eec85d800db8b81898be8038173f573833f76020fbd933c1f3bd9d4ed51ff480e6c0804f2197f1ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Tokenizer \
perl-SQL-Tokenizer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
