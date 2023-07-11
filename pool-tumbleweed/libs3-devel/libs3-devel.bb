SUMMARY = "Headers and documentation for libs3"
DESCRIPTION = "This library provides an API for using Amazon's S3 service. \
- access to all of S3's functionality \
- no requirement to know HTTP, XML or SSL \
- supports single-thread and multi-threaded operation in \
  synchronous and asynchronous fashion"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-devel-4.1.git277-1.16.aarch64.rpm"
RPM_HASH = "52ef23bbb233738cca18d8ce9628b72986457ae9b35b699a50aba342e7ac93ef32350fb0b67f509afbd5def6ad9ac0c0a1488bc4478233ed76639897e6b3154d"

RPROVIDES:${PN} += "libs3-devel"

RDEPENDS:${PN} += "libs3-4"

inherit rpm
