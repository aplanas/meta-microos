SUMMARY = "Provides an interface for RFC 2253 style DN strings"
DESCRIPTION = "X500::DN Provides a pure perl parser and formatter for RFC 2253 style \
DN strings. \
 \
 \
 \
Authors: \
-------- \
    Robert Joop <yaph-020416@timesink.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "perl-X500-DN-0.29-109.14.aarch64.rpm"
RPM_HASH = "346c7fcbda55b742d9911983cf92a481188b98534307b5db7ce0ff0c8cd3cb0c809ebb36b71aa2f455febd476dafd17c6735e34d6a98a2f8cff970e876e01f9b"

RPROVIDES:${PN} += "perl(X500::DN) \
perl(X500::RDN) \
perl-X500-DN \
perl-X500-DN(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-Parse-RecDescent"

inherit rpm
