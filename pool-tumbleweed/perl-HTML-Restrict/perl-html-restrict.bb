SUMMARY = "Strip unwanted HTML tags and attributes"
DESCRIPTION = "This module uses HTML::Parser to strip HTML from text in a restrictive \
manner. By default all HTML is restricted. You may alter the default \
behaviour by supplying your own tag rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0.2"

RPM_NAME = "perl-HTML-Restrict-3.0.2-1.3.noarch.rpm"
RPM_HASH = "7c21ab762a5b92d4fb721d6788391686566609554b955bf1407b94d737048c957c86d4911e59c57e07b135bfdaa0e08760410c1006cd6f632d3f3693d264a4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Restrict \
perl-HTML-Restrict"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
