SUMMARY = "Provide compiled List::MoreUtils functions"
DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on 'List::MoreUtils'. Since it's \
only a backend, the API is not public and can change without any warning."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-XS-0.430-1.18.aarch64.rpm"
RPM_HASH = "e55bcb983a98d4a45ea9a009035d09a47a6519c5cad50af56792662e5774933dd860a3d109e743e3d0b799fcc1d692e4d372f6c057b8936906d92c7f820bc917"

RPROVIDES:${PN} += "perl-List--MoreUtils--XS \
perl-List-MoreUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-XSLoader"

inherit rpm
