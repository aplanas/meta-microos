SUMMARY = "Let's Encrypt script for the Hiawatha webserver"
DESCRIPTION = "This is the Let's Encrypt script for the Hiawatha webserver. It can be used to \
request, renew and revoke certificated as provided by Let's Encrypt in a very \
easy way. It requires the PHP command line interface and uses version 2 of the \
ACME protocol to communicate with the Let's Encrypt server."
LICENSE = "GPL-2.0-only"

PV = "10.11"

RPM_NAME = "hiawatha-letsencrypt-10.11-4.7.aarch64.rpm"
RPM_HASH = "4c018d52c75cbdf844ba1f464de7df59fd040528ecfe9944f6a8d207c1c10650f83610235c66d415d7a62785c2627433c0a9ce25b10b12efc8587b0d07e45a1f"

RPROVIDES:${PN} += "hiawatha-letsencrypt \
hiawatha-letsencrypt(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/php \
hiawatha \
php-cli"

inherit rpm
