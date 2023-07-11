SUMMARY = "Development files for notmuch"
DESCRIPTION = "The notmuch-devel package contains libraries and header files for \
developing applications that use notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-devel-0.37-2.6.aarch64.rpm"
RPM_HASH = "0540bb013ccc75f5c7bb9770b89bc9899e8a14af24faf2007bc308e407c8ab73854d2b034714d90e526954e79db95ac3cd4a52b06d1fcecd5258ee20c8bf6986"

RPROVIDES:${PN} += "notmuch-devel"

RDEPENDS:${PN} += "libnotmuch5"

inherit rpm
