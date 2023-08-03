SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-amazon-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "acf6f83d1e912715c12026178a3bb595094097039bf0529ffd33420df4811d11f9030bccb1f506be7ef26ddf1ceff2b497684b184dc9559366ec90198f508c3f"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
