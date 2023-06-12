SUMMARY = "Devel files for Azure storage services"
DESCRIPTION = "Development files for working with Microsoft Azure storage services"
LICENSE = "Apache-2.0"

PV = "7.5.0"

RPM_NAME = "azure-storage-cpp-devel-7.5.0-1.16.aarch64.rpm"
RPM_HASH = "9a4759f690c6cdaabeeae22273ef9001f7ab0659515e0d71bbb33d8e0e9cf61c956db11396eb85668e32e8fb0b8fac8cd8a97cbe4d2956cead2ba3fa70afabc9"

RPROVIDES:${PN} += "azure-storage-cpp-devel \
azure-storage-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "libazurestorage7 \
libboost_chrono-devel \
libboost_date_time-devel \
libboost_filesystem-devel \
libboost_locale-devel \
libboost_log-devel \
libboost_random-devel \
libboost_regex-devel \
libboost_thread-devel \
pkgconfig(cpprest) \
pkgconfig(libssl) \
pkgconfig(libxml-2.0) \
pkgconfig(uuid)"

inherit rpm
