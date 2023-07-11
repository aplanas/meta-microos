SUMMARY = "Debug/Test tool to exercise the btrfs out-of-band deduplication ioctl"
DESCRIPTION = "Debug/Test tool to exercise a btrfs ioctl for deduplicating file regions."
LICENSE = "GPL-2.0-only"

PV = "0.11.3"

RPM_NAME = "btrfs-extent-same-0.11.3-1.8.aarch64.rpm"
RPM_HASH = "601f11e99d832aadbdc91a78e6713297ead67137c3ca4e8e2d9b10858f410eccd4f076a3a5a68d346a556b8339a1443fc89df7ec3169c9b18aaab078c0be9637"

RPROVIDES:${PN} += "btrfs-extent-same"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
