SUMMARY = "Provides an implementation of the XDG Base Directory Specification"
DESCRIPTION = "Provides an implementation of the XDG Base Directory Specification."
LICENSE = "Hippocratic-2.1"

PV = "7.0.2"

RPM_NAME = "ruby3.2-rubygem-xdg-7.0.2-1.1.aarch64.rpm"
RPM_HASH = "0c03616c1540446fd65108df560b8094eb2c7051e9f42469e976b7c446c5ef8fd0ccba95312bff3b392ade797f85c9fa9ba3647e473bf505f07a0cc50ccb2c60"

RPROVIDES:${PN} += "ruby3.2-rubygem-xdg \
ruby3.2-rubygem-xdg(aarch-64) \
rubygem(ruby:3.2.0:xdg) \
rubygem(ruby:3.2.0:xdg:7) \
rubygem(ruby:3.2.0:xdg:7.0) \
rubygem(ruby:3.2.0:xdg:7.0.2) \
rubygem(xdg)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
