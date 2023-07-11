SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.37"

RPM_NAME = "glibc-i18ndata-2.37-4.4.noarch.rpm"
RPM_HASH = "e28732a329c825edbf972a4bc661ea1f098b89702217c0bd48cb4e4a27116a273979d0142855aa05c5c23d83f0b76c3472a68066cfc1efbbfa40debdfd922eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"

RDEPENDS:${PN} += ""

inherit rpm
