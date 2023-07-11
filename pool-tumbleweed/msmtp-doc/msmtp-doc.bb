SUMMARY = "Documentation for msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage contains the documentation for msmtp, including \
examples and sample configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.24"

RPM_NAME = "msmtp-doc-1.8.24-1.1.noarch.rpm"
RPM_HASH = "901dedfc8d3ac40c9fd2066a882cd55256ffdd3eea9ac09931adea26c3e40c03bede78fe0751cc4d6362e7da1f7459edab7b9b7e78261cbdf396241bc481212f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msmtp-doc"

RDEPENDS:${PN} += "msmtp"

inherit rpm
