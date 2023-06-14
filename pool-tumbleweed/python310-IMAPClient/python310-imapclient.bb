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

RPM_NAME = "python310-IMAPClient-2.3.1-2.3.noarch.rpm"
RPM_HASH = "b7ca26194bae1f736da901d840a20e9a8bbff930307a21a74eef7f29e66f4d1d6735579d79b4a5a6e2d77b4e53d5fa8280ce0feb57369e62e6faa891a72f77c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMAPClient \
python3.10dist-imapclient \
python310-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
