SUMMARY = "Base class for HTML formatters"
DESCRIPTION = "Base class for HTML formatters"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.12"

RPM_NAME = "perl-HTML-Format-2.12-1.18.noarch.rpm"
RPM_HASH = "d903697ce7111c20b5e09e9efc592123fa725cc0d8477765cd1496d0eedc9e104fb9a5511c7b48abfdc694ee669f754338a75a6830496ccf71f07845df396cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatMarkdown \
perl-HTML--FormatPS \
perl-HTML--FormatRTF \
perl-HTML--FormatText \
perl-HTML--Formatter \
perl-HTML-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Font--Metrics--Courier \
perl-Font--Metrics--CourierBold \
perl-Font--Metrics--CourierBoldOblique \
perl-Font--Metrics--CourierOblique \
perl-Font--Metrics--Helvetica \
perl-Font--Metrics--HelveticaBold \
perl-Font--Metrics--HelveticaBoldOblique \
perl-Font--Metrics--HelveticaOblique \
perl-Font--Metrics--TimesBold \
perl-Font--Metrics--TimesBoldItalic \
perl-Font--Metrics--TimesItalic \
perl-Font--Metrics--TimesRoman \
perl-HTML--Element \
perl-HTML--TreeBuilder \
perl-parent"

inherit rpm
