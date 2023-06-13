SUMMARY = "Provide compiled List::MoreUtils functions"
DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on 'List::MoreUtils'. Since it's \
only a backend, the API is not public and can change without any warning."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-XS-0.430-1.16.aarch64.rpm"
RPM_HASH = "1912713011fcd94d37746e507d9ca25aafd05d021a769265815657c0ab6731fbc4995836db74e3d8304d8629c38010127da8b0286346a5599184cd140d41aeff"

RPROVIDES:${PN} += "perl(List::MoreUtils::XS) \
perl-List-MoreUtils-XS \
perl-List-MoreUtils-XS(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(XSLoader)"

inherit rpm
