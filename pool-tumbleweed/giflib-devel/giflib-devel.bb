SUMMARY = "Library for Working with GIF Images - Files Mandatory for Development"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-devel-5.2.1-4.1.aarch64.rpm"
RPM_HASH = "f36c6837d521e20aebc0770ccbd148d379b3b122a5690e887175beaf8326c3382772840eba7326cc4b6fafdbff8007152cdded91be8447c8ba51624cb229ae84"

RPROVIDES:${PN} += "giflib-devel"

RDEPENDS:${PN} += "libgif7"

inherit rpm
