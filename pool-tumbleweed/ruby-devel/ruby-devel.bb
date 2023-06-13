SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-devel-3.2-1.1.aarch64.rpm"
RPM_HASH = "5b096a8506b86a34d5e00bb9c43d58c428f1a32f41ee0a8e5aa0189a32ee49ea760863200b69098f9d89c97e4fa772baf67b751bd4a8e0422d29a86f0d0a7937"

RPROVIDES:${PN} += "ruby-devel \
ruby-devel(aarch-64)"

RDEPENDS:${PN} += "ruby \
ruby3.2-devel"

inherit rpm
