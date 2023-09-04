SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kholidays-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d381c8a91b913e7473ed64e1c1af1acd51178eaea56f055644c546b88f52cbf8ac4f40a8c1d37a23a5680008b29a59f0d66f5c4027153b5a016c5bf3fe8072eb"

RPROVIDES:${PN} += "kholidays"

RDEPENDS:${PN} += ""

inherit rpm
