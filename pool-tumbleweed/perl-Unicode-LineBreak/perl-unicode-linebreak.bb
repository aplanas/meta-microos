SUMMARY = "UAX #14 Unicode Line Breaking Algorithm"
DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in Unicode \
Standard Annex #14 [UAX #14]. East_Asian_Width informative property defined \
by Annex #11 [UAX #11] will be concerned to determine breaking positions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2019.001"

RPM_NAME = "perl-Unicode-LineBreak-2019.001-1.27.aarch64.rpm"
RPM_HASH = "c4e838cd1a0b9c72652e2731d6deb8329b03440aa5af941fbcc7debcd3c69922999c7623cbbc92b403487fd46c49ad426d4e5c7dd679d11a54f70b2e218cf3bd"

RPROVIDES:${PN} += "perl-Text--LineFold \
perl-Unicode--GCString \
perl-Unicode--LineBreak \
perl-Unicode-LineBreak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-MIME--Charset"

inherit rpm
