SUMMARY = "kinder, gentler I/O for Ruby"
DESCRIPTION = "This is a legacy project, do not use it for new projects.  Ruby \
2.3 and later should make this obsolete.  kgio provides \
non-blocking I/O methods for Ruby without raising exceptions on \
EAGAIN and EINPROGRESS."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.4"

RPM_NAME = "ruby3.2-rubygem-kgio-2.11.4-1.13.aarch64.rpm"
RPM_HASH = "0acc25a4ec8bc7e93591173a6b02a7d8a899e7c2679ed52e3b6e5e998802a93b9ee1c512abd11441bacfbaf44baad26687e69aec38f40c26b5b516b8502a06e7"

RPROVIDES:${PN} += "ruby3.2-rubygem-kgio \
ruby3.2-rubygem-kgio(aarch-64) \
rubygem(kgio) \
rubygem(ruby:3.2.0:kgio) \
rubygem(ruby:3.2.0:kgio:2) \
rubygem(ruby:3.2.0:kgio:2.11) \
rubygem(ruby:3.2.0:kgio:2.11.4)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
