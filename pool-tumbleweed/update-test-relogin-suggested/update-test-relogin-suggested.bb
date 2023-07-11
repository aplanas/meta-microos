SUMMARY = "Test update that requires a session restart"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a session \
restart (re-login) is necessary. This is used, for example, in \
window manager updates."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-relogin-suggested-5.1-1.18.aarch64.rpm"
RPM_HASH = "95ca0e78fe7b902490cae1f34382e32e97169a5a41b66e1933015b4a0b12a479e0a25a91929a38c2e6cdff5fa300ba1de717e24a3394099733e0bdb6148b7f9b"

RPROVIDES:${PN} += "update-test-relogin-suggested"

RDEPENDS:${PN} += ""

inherit rpm
