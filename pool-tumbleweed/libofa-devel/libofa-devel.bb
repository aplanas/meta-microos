SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa-devel-0.9.3-104.16.aarch64.rpm"
RPM_HASH = "9ceac93525fc97ef565ce1f02a2fa73663d0b6963dbd7d7d7a572c6011c889b8a572d03a00a4ab33be950b8b5d7b5d013bc0c4748b7ba1211217f8fa06d6d42f"

RPROVIDES:${PN} += "libofa-devel \
pkgconfig-libofa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libofa0 \
pkgconfig-expat \
pkgconfig-fftw3"

inherit rpm
