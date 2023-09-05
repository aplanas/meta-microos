SUMMARY = "KDE PIM Libraries for Akonadi Contacts"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-contact-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3beffa2f5e6042c719acaa7c9578988a73d34ec6d7df021ed7d64dd25b9b68ba2e0bbfbfb272e33928a2cdd3f598eb6313933307c729fdf6b0ba153eab22fb5e"

RPROVIDES:${PN} += "akonadi-contact \
akonadi-contacts"

RDEPENDS:${PN} += "libKPim5AkonadiContact5 \
libKPim5ContactEditor5"

inherit rpm
