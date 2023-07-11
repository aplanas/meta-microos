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

RPM_NAME = "python39-IMAPClient-2.3.1-2.5.noarch.rpm"
RPM_HASH = "7507bb2da6dceb238e79f7e8ea046cda7d4ef4073db96c5eaac56105b8afb5131054d95f726003fb37b523160b62d16def5f2df76c96f972d6efe5738bcb4e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imapclient \
python39-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
