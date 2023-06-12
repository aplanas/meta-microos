SUMMARY = "Development files for rtl-sdr"
DESCRIPTION = "Library headers for rtl-sdr driver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-devel-0.6.0-2.8.aarch64.rpm"
RPM_HASH = "63b92397633258ec2fa5a7bd848668db1e617247b839642a76d7598ba6c686430bfd83d1604cb75516026ba706cccf1f6c74d4deecd95ab7902db388b2037c2a"

RPROVIDES:${PN} += "cmake(rtlsdr) \
pkgconfig(librtlsdr) \
rtl-sdr-devel \
rtl-sdr-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
rtl-sdr"

inherit rpm
