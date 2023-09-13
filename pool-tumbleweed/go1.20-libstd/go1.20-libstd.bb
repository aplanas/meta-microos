SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.20.8"

RPM_NAME = "go1.20-libstd-1.20.8-1.1.aarch64.rpm"
RPM_HASH = "be2df2bf54e1ef745f0d752471ab359f364f6d31880970ef4d20cbd6aa67d39c0c7356a57add73da1ca8a4e0352f7c8b5f35ee46b15e219e09301f4a4070922a"

RPROVIDES:${PN} += "go-libstd \
go1.20-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
