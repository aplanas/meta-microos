SUMMARY = "UAX #14 Unicode Line Breaking Algorithm"
DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in Unicode \
Standard Annex #14 [UAX #14]. East_Asian_Width informative property defined \
by Annex #11 [UAX #11] will be concerned to determine breaking positions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2019.001"

RPM_NAME = "perl-Unicode-LineBreak-2019.001-1.26.aarch64.rpm"
RPM_HASH = "28b894d97540308ec71320d2fd1533eec5d13293bd8c4f4fbc6fd3e8ca235d399c59fb679b04699d507e30b1f986b8a666acf3f2b9351f34977c8eca1279fbc0"

RPROVIDES:${PN} += "perl-Text--LineFold \
perl-Unicode--GCString \
perl-Unicode--LineBreak \
perl-Unicode-LineBreak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-MIME--Charset"

inherit rpm
