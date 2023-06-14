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

PV = "8.17.1"

RPM_NAME = "libmilter-doc-8.17.1-9.1.noarch.rpm"
RPM_HASH = "21969133adf066665796108dfc22037cd84bda598658554fae1fbdc35a984118dd80c3842525d7554f6abfda5256edda5053dd823e6bd157f495c09cf6877213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmilter-doc"

RDEPENDS:${PN} += "libmilter1-0"

inherit rpm
