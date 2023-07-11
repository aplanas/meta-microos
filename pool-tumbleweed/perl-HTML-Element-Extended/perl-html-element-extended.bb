SUMMARY = "Extension for HTML::Element"
DESCRIPTION = "HTML-Element-Extended is a package of several enhanced HTML::Element \
classes, most of which arose during the effort to implement an \
HTML::Element based table class. \
 \
The modules are: \
        HTML::ElementTable \
        HTML::ElementSuper \
        HTML::ElementGlob \
        HTML::ElementRaw \
 \
The resulting functionality enables: \
        tables \
        element globs \
        element coordinates \
        content replacement \
        content wrapping \
        element cloning \
        raw HTML string adoption"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.18"

RPM_NAME = "perl-HTML-Element-Extended-1.18-14.27.noarch.rpm"
RPM_HASH = "a56e612cd2428201fe40a120159a89f27061a9903a8fd3aff6f323810d70fa04312b94143f4563e3c597550966e09e785b8c032c75ee80d14d9ac51e8644c5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--ElementGlob \
perl-HTML--ElementRaw \
perl-HTML--ElementSuper \
perl-HTML--ElementSuper--ContentWatchdog \
perl-HTML--ElementTable \
perl-HTML--ElementTable--DataElement \
perl-HTML--ElementTable--Element \
perl-HTML--ElementTable--HeaderElement \
perl-HTML--ElementTable--RowElement \
perl-HTML--ElementTable--RowGlob \
perl-HTML-Element-Extended"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Dumper \
perl-HTML--Element"

inherit rpm
