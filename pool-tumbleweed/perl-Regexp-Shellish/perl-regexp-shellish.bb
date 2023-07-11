SUMMARY = "Shell-like regular expressions"
DESCRIPTION = "Provides shell-like regular expressions.  The wildcards provided are ?, \
* and **, where ** is like * but matches /.  See compile_shellish for \
details. \
 \
 \
 \
Authors: \
-------- \
    Barrie Slaymaker <barries at slaysys dot com>"
LICENSE = "Artistic-1.0"

PV = "0.93"

RPM_NAME = "perl-Regexp-Shellish-0.93-164.30.aarch64.rpm"
RPM_HASH = "6cbeba4c626749c6f9629279b65117f4241124bd9e84cd228046cb6bf24c5091eb1e2ea41f67f4e8121b651aafc1ca69a8b095c34f80228a7e6a8ff70cb76524"

RPROVIDES:${PN} += "perl-Regexp--Shellish \
perl-Regexp-Shellish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
