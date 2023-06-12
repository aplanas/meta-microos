SUMMARY = "Service to duplicate labels with a custom prefix"
DESCRIPTION = "This service can be used during buildtime to implement the \
suse_label_helper:add_prefix element useful for building containers."
LICENSE = "GPL-2.0-or-later"

PV = "0.0"

RPM_NAME = "obs-service-kiwi_label_helper-0.0-4.2.noarch.rpm"
RPM_HASH = "b37d9bfb9537382bc8f0620a8fa2bd2f89d1571f8f95dda99a072966a7d01085c80b7e742332c01505a15b197b0881431369abd6272f421eef1bdb686c63c1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-kiwi_label_helper"
RDEPENDS:${PN} += "/bin/bash \
libxslt-tools"

inherit rpm
