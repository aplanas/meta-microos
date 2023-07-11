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

RPM_NAME = "libmilter1_0-8.17.2-1.1.aarch64.rpm"
RPM_HASH = "4f418ffa26d48240d62af4269370919c5408deae12a212f497f46bf449ce3c2b84d3dbd07ac7429b3a0d45422fa4222f89ebdd448001adee5941923b8d8520f2"

RPROVIDES:${PN} += "libmilter.so.1.0 \
libmilter1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
smtp-daemon"

inherit rpm
