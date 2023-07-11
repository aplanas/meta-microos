SUMMARY = "Pythonic IMAP client library"
DESCRIPTION = "IMAPClient is a Pythonic IMAP client library. \
 \
Features: \
    * Arguments and return values are natural Python types. \
    * IMAP server responses are parsed and readily usable. \
    * IMAP unique message IDs (UIDs) and internationalised \
      mailbox names are handled transparently. \
    * Time zones are handled. \
    * Convenience methods are provided for commonly used functionality. \
    * Exceptions are raised when errors occur. \
 \
IMAPClient includes comprehensive units tests and automated \
functional tests that can be run against a live IMAP server."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python311-IMAPClient-2.3.1-2.5.noarch.rpm"
RPM_HASH = "2fe3f0519b5b1f64877e905cba22eece8a4d52ea11e85fe2153f85d2b0d145d4cb3eba8f742f07df89ade73c0567f818170713f4c7b30719bd90bc7e25d28999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMAPClient \
python3.11dist-imapclient \
python311-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
