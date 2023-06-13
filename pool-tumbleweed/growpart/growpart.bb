SUMMARY = "Grow a partition"
DESCRIPTION = "Grow a partition. This is predominantly useful in the cloud when an instance \
is started with a larger root partition than the image size. The root \
partition can be expanded to take up the additional size."
LICENSE = "GPL-3.0-only"

PV = "0.30"

RPM_NAME = "growpart-0.30-6.10.noarch.rpm"
RPM_HASH = "f6138ef7949f70709cf63788402745a7363fb5362abee6f99734dc0239c20c39932f666b86c44f5fae165ff934758abd736b7d4badcd09766fb08fec2f35ffe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "growpart"

RDEPENDS:${PN} += "/bin/sh \
gptfdisk \
util-linux"

inherit rpm
