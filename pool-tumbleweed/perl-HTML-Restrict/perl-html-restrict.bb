SUMMARY = "Strip unwanted HTML tags and attributes"
DESCRIPTION = "This module uses HTML::Parser to strip HTML from text in a restrictive \
manner. By default all HTML is restricted. You may alter the default \
behaviour by supplying your own tag rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0.2"

RPM_NAME = "perl-HTML-Restrict-3.0.2-1.2.noarch.rpm"
RPM_HASH = "0c809431a5aaa2a061fbbd9dd3cd23a2a429ae2839767d9e2c07ab9d6cabdfedc84f1303578198ee7cc75de0df606c1d006300f17446248371b41d7b621c140f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Restrict \
perl-HTML-Restrict"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Dump \
perl-HTML--Entities \
perl-HTML--Parser \
perl-List--Util \
perl-Moo \
perl-Sub--Quote \
perl-Type--Tiny \
perl-Types--Standard \
perl-URI \
perl-namespace--clean \
perl-version"

inherit rpm
