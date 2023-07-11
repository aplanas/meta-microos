SUMMARY = "BSD Sendmail Content Management API (milter)"
DESCRIPTION = "Sendmail's Content Management API (milter) provides third-party programs to \
access mail messages as they are being processed by the Mail Transfer Agent \
(MTA), allowing them to examine and modify message content and \
meta-information. Filtering policies implemented by Milter-conformant filters \
may then be centrally configured and composed in an end-user's MTA \
configuration file. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.2"

RPM_NAME = "libmilter-doc-8.17.2-1.1.noarch.rpm"
RPM_HASH = "99e19875474df1e1c2a1c0c3871efd0167c6a967e7482e0c0269dc20027dce734af5fcf97b05fc512749751838051eb59029b158f84a15cf525d1bc8f596605a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmilter-doc"

RDEPENDS:${PN} += "libmilter1-0"

inherit rpm
