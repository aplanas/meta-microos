SUMMARY = "Headers and documentation for libs3"
DESCRIPTION = "This library provides an API for using Amazon's S3 service. \
- access to all of S3's functionality \
- no requirement to know HTTP, XML or SSL \
- supports single-thread and multi-threaded operation in \
  synchronous and asynchronous fashion"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-devel-4.1.git277-1.15.aarch64.rpm"
RPM_HASH = "d971d38c72dd412be0f581108d2423e986126ab3a8510487ae4343ed5576c06e6bae4e29e497a6f829a67c2179f0d0d58f707df3c0abcea799a03a392462308b"

RPROVIDES:${PN} += "libs3-devel"

RDEPENDS:${PN} += "libs3-4"

inherit rpm
