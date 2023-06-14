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

RPM_NAME = "python39-IMAPClient-2.3.1-2.3.noarch.rpm"
RPM_HASH = "8bb86cdad963e8c3574f7b4b1e411de4293de1f36b103b235d6adb9fe9e594cd2a3e7d4a9004d0fa3c77a3c4a64c5eaff737ff7038b2c6ebd734c4742d359153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imapclient \
python39-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
