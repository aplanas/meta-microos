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

RPM_NAME = "perl-HTML-Element-Extended-1.18-14.26.noarch.rpm"
RPM_HASH = "503f2f29ad952184eaaa41e99028adc9405791a276ba426a6c682ca9f5fe3dac3073911d70319a10c329f2d34891cacf4b8e4c864e06f2bf872c0d55bdc6969b"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Data--Dumper \
perl-HTML--Element"

inherit rpm
