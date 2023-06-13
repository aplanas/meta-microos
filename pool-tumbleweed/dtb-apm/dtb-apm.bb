SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-apm-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "b9f14c540bd43693b79549afa1b909d38a6b2ec2db21b50a4826ea57097ec501cc0d0e7ac9647dc72fb67d83ed137668ae89553fcbbd36d6ea5a14854b2bfea6"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm(aarch-64) \
dtb-apm-mustang \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
