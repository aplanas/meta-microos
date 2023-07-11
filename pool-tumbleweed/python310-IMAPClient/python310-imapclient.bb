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

RPM_NAME = "python310-IMAPClient-2.3.1-2.5.noarch.rpm"
RPM_HASH = "00935ebb3b949275caa043c063dfb2a64c6d680cad1a59cf8c3db583fb84706bcf79e2004c3462bb20d0a84afcfee51d6e39a5eaf4cb9edc8c6512860d7bfafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imapclient \
python310-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
