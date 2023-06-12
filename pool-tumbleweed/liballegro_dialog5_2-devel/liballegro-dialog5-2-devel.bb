SUMMARY = "Development files for liballegro_dialog"
DESCRIPTION = "Development files needed to build applications which use liballegro_dialog."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_dialog5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "ed505155e7d1f7d1d8301c500f69286bfd179d7c0e8fa07b4a388249684d39090719dcbe2aafa843215cbe4170111b526a21cb62b6f6d761aff0569794167690"

RPROVIDES:${PN} += "liballegro_dialog5_2-devel \
liballegro_dialog5_2-devel(aarch-64) \
pkgconfig(allegro_dialog-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_dialog5_2 \
pkgconfig(allegro-5)"

inherit rpm
