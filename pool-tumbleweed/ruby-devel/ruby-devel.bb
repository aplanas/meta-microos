SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-devel-3.2-1.2.aarch64.rpm"
RPM_HASH = "bff8a411ceb8a3460c69272ae347ed0e188314e58b737617b5277f8048ed1330b0666534c07287fd11c24230218a01795583e00513c454c75be640b998604c34"

RPROVIDES:${PN} += "ruby-devel"

RDEPENDS:${PN} += "ruby \
ruby3.2-devel"

inherit rpm
