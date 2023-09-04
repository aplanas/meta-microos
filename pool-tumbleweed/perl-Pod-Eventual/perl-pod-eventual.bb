SUMMARY = "Read a POD document as a series of trivial events"
DESCRIPTION = "POD is a pretty simple format to write, but it can be a big pain to deal \
with reading it and doing anything useful with it. Most existing POD \
parsers care about semantics, like whether a '=item' occurred after an \
'=over' but before a 'back', figuring out how to link a 'L<>', and other \
things like that. \
 \
Pod::Eventual is much less ambitious and much more stupid. Fortunately, \
stupid is often better. (That's what I keep telling myself, anyway.) \
 \
Pod::Eventual reads line-based input and produces events describing each \
POD paragraph or directive it finds. Once complete events are immediately \
passed to the 'handle_event' method. This method should be implemented by \
Pod::Eventual subclasses. If it isn't, Pod::Eventual's own 'handle_event' \
will be called, and will raise an exception."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.094003"

RPM_NAME = "perl-Pod-Eventual-0.094003-1.4.noarch.rpm"
RPM_HASH = "e014eeeaeea12d10b17dfccb1af81adb0e63cabe0d79626bab27ba016da5d90d0f57d9174850664ad8712b4f2f0a7ee4c2ea1957133d206500e178d7f55ba43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Eventual \
perl-Pod--Eventual--Simple \
perl-Pod-Eventual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mixin--Linewise--Readers"

inherit rpm
