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

RPM_NAME = "perl-HTML-Element-Extended-1.18-14.28.noarch.rpm"
RPM_HASH = "f868c1d9b6901d21f86ee205eeb44ff489f1d29c1c0e0ce6fbdc5e000802b4bd3e91bd245909750d4df90d7656338bd2030f68eb12b97573c04ea9b08d5956d0"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Dumper \
perl-HTML--Element"

inherit rpm
