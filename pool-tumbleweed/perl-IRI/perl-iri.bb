SUMMARY = "Internationalized Resource Identifiers"
DESCRIPTION = "The IRI module provides an object representation for Internationalized \
Resource Identifiers (IRIs) as defined by at \
http://www.ietf.org/rfc/rfc3987.txt and supports their parsing, \
serializing, and base resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.011"

RPM_NAME = "perl-IRI-0.011-1.15.noarch.rpm"
RPM_HASH = "989fdbac8c7834a1533f11cd84e4ab6032aa55f06f9793369a189174b5918402b1403198b0cd1e3f9ad5be7a5f5fe3ca54a5118c1b4b6b11db836b4f817ad1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IRI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-MooX--HandlesVia \
perl-Type--Tiny"

inherit rpm
