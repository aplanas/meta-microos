SUMMARY = "Special development files of ruby, normally not installed"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-devel-extra-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "656037ea5519b536b787789252447e7275770f8a23927ab633db5c903e61850c3ddbd1d52c3f32de15c6dabe79002bbd2c3d367b6cbca3ec37e8b844d69193da"

RPROVIDES:${PN} += "ruby3.2-devel-extra"

RDEPENDS:${PN} += "ruby3.2-devel"

inherit rpm
