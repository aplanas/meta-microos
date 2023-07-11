SUMMARY = "Internationalized Resource Identifiers"
DESCRIPTION = "The IRI module provides an object representation for Internationalized \
Resource Identifiers (IRIs) as defined by at \
http://www.ietf.org/rfc/rfc3987.txt and supports their parsing, \
serializing, and base resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.011"

RPM_NAME = "perl-IRI-0.011-1.14.noarch.rpm"
RPM_HASH = "c1801428489a76ab7e6208a7363a7bf31e81e413d137e4d2fe320c9e064eba98fb4ca65a5cd37a2166fcbd5659de3392ef9fe03be77e5b92159ec7ae4730dd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IRI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moo \
perl-MooX--HandlesVia \
perl-Type--Tiny"

inherit rpm
