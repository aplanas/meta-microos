SUMMARY = "Provide compiled List::MoreUtils functions"
DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on 'List::MoreUtils'. Since it's \
only a backend, the API is not public and can change without any warning."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-XS-0.430-1.17.aarch64.rpm"
RPM_HASH = "ed6b74891c285c25be3a718e1d42d59e0ad01ce0300fdb14c59f87ebd57cc73ac69446fc5cbea9d0f28396e67a724cd60d70a86fb0cc0b68557229a702c1de09"

RPROVIDES:${PN} += "perl-List--MoreUtils--XS \
perl-List-MoreUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-XSLoader"

inherit rpm
