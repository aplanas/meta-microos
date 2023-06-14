SUMMARY = "An IMAP Client API"
DESCRIPTION = "This module provides methods implementing the IMAP protocol to support \
interacting with IMAP message stores. \
 \
The module is used by constructing or instantiating a new IMAPClient object \
via the new constructor method. Once the object has been instantiated, the \
connect method is either implicitly or explicitly called. At that point \
methods are available that implement the IMAP client commands as specified \
in *RFC3501*. When processing is complete, the logout object method should \
be called. \
 \
This documentation is not meant to be a replacement for RFC3501 nor any \
other IMAP related RFCs. \
 \
Note that this documentation uses the term _folder_ in place of RFC3501's \
use of _mailbox_. This documentation reserves the use of the term _mailbox_ \
to refer to the set of folders owned by a specific IMAP id."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.43"

RPM_NAME = "perl-Mail-IMAPClient-3.43-1.10.noarch.rpm"
RPM_HASH = "b547e72614ae341a26c5e2d79536448757015ded8cf64a2734d77789515f72ae0cb559db454cc8d269480b778eb020a15d0f2f8717b559abcc6237bddf98947d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--IMAPClient \
perl-Mail--IMAPClient--BodyStructure \
perl-Mail--IMAPClient--BodyStructure--Address \
perl-Mail--IMAPClient--BodyStructure--Envelope \
perl-Mail--IMAPClient--BodyStructure--Parse \
perl-Mail--IMAPClient--BodyStructure--Part \
perl-Mail--IMAPClient--MessageSet \
perl-Mail--IMAPClient--Thread \
perl-Mail-IMAPClient \
perl-Parse--RecDescent--Mail--IMAPClient--BodyStructure--Parse \
perl-Parse--RecDescent--Mail--IMAPClient--Thread"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Parse--RecDescent"

inherit rpm
