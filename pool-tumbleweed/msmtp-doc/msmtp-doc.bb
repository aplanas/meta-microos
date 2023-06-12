SUMMARY = "Documentation for msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage contains the documentation for msmtp, including \
examples and sample configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.23"

RPM_NAME = "msmtp-doc-1.8.23-1.3.noarch.rpm"
RPM_HASH = "3a874e391c73b006e9dfce6428fa8e91530f0dd3399f2ccf1624a41c94bb737f344aa9dda7bafbdf79f8646b3d5ea327d94f42fabb65f30a88e3993af5445bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msmtp-doc"
RDEPENDS:${PN} += "msmtp"

inherit rpm
