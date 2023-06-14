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

RPM_NAME = "perl-Regexp-Shellish-0.93-164.29.aarch64.rpm"
RPM_HASH = "df9a08fee4d98ea7ef056515765ca97616476220575748d570cd5987360ef07088e95b31502225e3eb73f26ba4e6a686cc6266795f010fcd19919efba678dd0a"

RPROVIDES:${PN} += "perl-Regexp--Shellish \
perl-Regexp-Shellish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
