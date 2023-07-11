SUMMARY = "Development files for csync"
DESCRIPTION = "The libcsync-devel package contains the static libraries and header \
files needed for development with csync."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-devel-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "53f0e9fc294b7b9236667c7b6be7d2ecfa27dc2984b6b3a548283f4609112bc69c1c13c10b338ff2b02dbb98b1cff42e274dd3f925eb89cb231745db98609b90"

RPROVIDES:${PN} += "libcsync-devel"

RDEPENDS:${PN} += "libcsync0"

inherit rpm
