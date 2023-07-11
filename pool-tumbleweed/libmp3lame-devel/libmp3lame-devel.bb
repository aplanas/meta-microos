SUMMARY = "Development files for the LAME MP3 encoder"
DESCRIPTION = "Contains the header files for use with LAME's encoding library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame-devel-3.100-5.4.aarch64.rpm"
RPM_HASH = "132ad6377adb5825dd9c7a57fafd1ebb8d4c879e592e4cdf22eccc1b863f31b5661c462f23977d150241ae0c47ccbcd0579b527c7eecf2f9afff007c34e48e7b"

RPROVIDES:${PN} += "libmp3lame-devel \
pkgconfig-lame \
pkgconfig-libmp3lame"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmp3lame0"

inherit rpm
