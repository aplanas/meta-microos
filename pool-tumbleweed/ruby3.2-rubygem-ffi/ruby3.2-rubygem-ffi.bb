SUMMARY = "Ruby FFI"
DESCRIPTION = "Ruby FFI library."
LICENSE = "BSD-3-Clause"

PV = "1.15.5"

RPM_NAME = "ruby3.2-rubygem-ffi-1.15.5-1.12.aarch64.rpm"
RPM_HASH = "0d9f30b657bcb1098dc7c937ff523f86a3dea127f3b6a67d15063e33349ed9505ecac909e001916b334e9f4e6c24abf2170f321db86f4ee7aa41cf81c9594005"

RPROVIDES:${PN} += "ruby3.2-rubygem-ffi \
ruby3.2-rubygem-ffi(aarch-64) \
rubygem(ffi) \
rubygem(ruby:3.2.0:ffi) \
rubygem(ruby:3.2.0:ffi:1) \
rubygem(ruby:3.2.0:ffi:1.15) \
rubygem(ruby:3.2.0:ffi:1.15.5)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
